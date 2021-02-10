package 实现顺序表;

public class MyArrayList {
    //存放元素
    private String[] data = null;
    //数组长度
    private int size = 0;
    //数组最大容量
    private int capacity = 100;

    public MyArrayList(){
        data = new String[capacity];
    }


    //数组扩容
    private void realloc(){
        capacity = capacity * 2;//扩大二倍
        String[] newData = new String[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }
    //增加方法
    public void add(String element){
        if(size > capacity){
            //进行扩容
            realloc();
        }
        data[size] = element;
        size++;
    }
    //根据下标增加元素
    public void add(int index,String element){
        if(index < 0 || index >= size){
            return;
        }
        if(size >= capacity){
            realloc();
        }
        //将需要插入的元素放到数组中,插入元素的后面的元素依次向后移动
        for (int i = size -1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = element;
        size++;
    }
    //根据下标删除元素
    public String remove(int index){
        if(index < 0 || index >= size){
            return  null;
        }
        String result  = data[index];
        for (int i = index; i < size -1; i++) {
            data[index] = data[index+1];
        }
        //删除之后size--
        size--;
        return result;
    }
    //根据提供的元素来删除
    public boolean remove(String element){
        //找元素存在位置
        int index = 0;
        for (; index < size; index++) {
            if(data[index].equals(element)){
                break;
            }
        }
        if(index >= size){
            return false;
        }

        //找到index进行删除
        for (int i = index; i < size -1; i++){
            data[i] = data[i+1];
        }
        size--;
        return true;
    }

    public String get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        return data[index];
    }

    public void set(int index , String element){
        if(index < 0 || index >= size){
            return;
        }
        data[index] = element;
    }

    public boolean contains(String element){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    //查找元素位置
    public int indexOf(String element){
        for (int i = 0; i < size; i++) {
            if(data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    // 查找元素位置(从后往前)
    public int lastIndexOf(String element){
        for (int i = size - 1; i >= 0; i--){
            if(data[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    public void clear(){
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public String toString(){
        StringBuffer string = new StringBuffer("");
        string.append("[");
        for (int i = 0; i < size; i++) {
            string.append(i);
            if(i < size - 1){
                string.append(",");
            }
        }
        string.append("]");
        return string.toString();
    }







}

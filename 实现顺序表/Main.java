package 实现顺序表;

public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("python");
        System.out.println(list.size());
        System.out.println(list);
        list.remove(1);
        System.out.println(list.size());
        System.out.println(list);
    }

}


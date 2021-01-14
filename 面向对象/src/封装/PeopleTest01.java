package 封装;
/*
    封装的好处
        1、保护代码的安全性
        2、暴露简单，隐藏复杂
    set和get方法书写要求
        set方法：
            public void set+属性名（属性名首字母大写）(有一个参数){

            }
        get方法：
            public 返回值类型 get+属性名（属性名首字母大写)(无参数){
            }
 */
public class PeopleTest01 {
    public static void main(String[] args) {
        People p = new People();
        //调用getAge()方法
        int pAge = p.getAge();
        System.out.println(pAge);

        //调用set方法
        p.setAge(100);
        System.out.println(p.getAge());


        p.setAge(-100);
        System.out.println(p.getAge());//100
        //因为-100并没能通过set关卡，没赋值成功，这里输出的还是上一次age的值
    }
}
//封装的People类
class People{
    /*
    private表示私有的，被这个关键词修饰之后，该数据只能在本类中进行访问
    出了这个类，就不能在被直接访问了访问了，
    外部程序只能通过对外提供的简单的访问入口来完成访问

     */
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        //可以在set方法里设置关卡
        if(age < 0 || age > 150){
            System.out.println("年龄不合法，请重新赋值");
            return;
        }
        this.age = age;
    }

}
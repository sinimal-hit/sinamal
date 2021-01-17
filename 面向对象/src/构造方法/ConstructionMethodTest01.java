package 构造方法;

public class ConstructionMethodTest01 {
    public static void main(String[] args) {
        new Student();
    }
}
class Student{
    int no;//学号
    String name;
    int age;
    public Student(){
        System.out.println("无参构造方法执行啦！！");
    }
}

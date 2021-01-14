package 封装;

import this关键字.People;

public class StudentTest01 {
    public static void main(String[] args) {
        People s1 = new People();
        s1.setName("你好");
        System.out.println(s1.getName());
        s1.run();
        Student s = new Student();
        s.setName("张三");
        s.setNo(112233);
        System.out.println("姓名："+s.getName());
        System.out.println("学号："+s.getNo());
    }
}
class Student{
    private String name;
    private int no;
    //构造方法
    public Student(){

    }
    public Student(String name,int no){
        this.name = name;
        this.no = no;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){//实际上是获取当前对象的name；
        return name;//严格来说这里也是有this的，只不过这个this是可以省略的，它默认是返回当前对象的name
    }
    public void setNo(int no){
        this.no = no;
    }
    public int getNo(){
        return no;
    }
}

package Object类;
/*
    System.out.println()
    toString()
 */

import java.util.Objects;

public class Test {
    static Student student = new Student();
    public static void main(String[] args) {
        Test.student.exam();//System.out.println()
        Test test = new Test();
        String retValue = test.toString();
        System.out.println(retValue);//Object类.Test@29453f44
        //29453f44 可以等同看作与堆内存中对象的内存地址，实际上是通过“哈希算法”得出的十六进制的结果；

        System.out.println(test);//Object类.Test@29453f44
    }
}
class Student{
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public Student() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age;
    }



    public void exam(){
        System.out.println("正在考试........");
    }
}

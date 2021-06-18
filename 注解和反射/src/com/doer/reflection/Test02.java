package com.doer.reflection;

import org.omg.PortableInterceptor.INACTIVE;

//测试Class的创建方式有哪些
public class Test02 {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是: "+person.name);

        //方式1,通过对象获得
        Class c1 = person.getClass();
        System.out.println(c1.hashCode());

        //方式2 :forName获得
        Class c2 = Class.forName("com.doer.reflection.Student");
        System.out.println(c2.hashCode());

        //方式3: 通过类名.class获得
        Class c3 = Student.class;
        System.out.println(c3.hashCode());

        //方式4:基本内置类型的包装类型都有一个TYPE属性
        Class<Integer> c4 = Integer.TYPE;
        System.out.println(c4);


        //获得父类类型
        Class c5 = c1.getSuperclass();
        System.out.println(c5);

    }
}
class Person{
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person{
    public Student(){
        this.name = "学生";
    }
}
class Teacher extends Person{
    public Teacher(){
        this.name = "老师";
    }
}

package com.doer.reflection;

import java.lang.annotation.*;

//反射操作注解
public class Test12 {
    public static void main(String[] args) {
        Class c1 = Student2.class;

        //通过反射获取注解
        Annotation[] annotations = c1.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得注解value的值
        Table table = (Table) c1.getAnnotation(Table.class);
        String value = table.value();
        System.out.println(value
        );
    }

}

@Table("db_student")
class Student2{
    @Filed(columnName = "db_id",type = "int",length = 10)
    private int id;
    @Filed(columnName = "db_age",type = "int",length = 10)

    private int age;
    @Filed(columnName = "db_name",type = "int",length = 3)

    private String name;

    public Student2(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public Student2() {
    }

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
    String value();
}

//属性的注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface Filed{
    String columnName();
    String type();
    int length();
}
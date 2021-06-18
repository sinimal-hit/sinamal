package com.doer.reflection;
//什么是反射
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //通过反射机制获取Class对象
        Class<?> c1 = Class.forName("com.doer.reflection.User");
        System.out.println(c1);

        Class<?> c2 = Class.forName("com.doer.reflection.User");
        Class<?> c3 = Class.forName("com.doer.reflection.User");
        Class<?> c4 = Class.forName("com.doer.reflection.User");


        //一个类在内存中只有一个Class对象
        //一个类被加载之后,类的整个结构都会被封装在Class对象中
        System.out.println(c2.hashCode());//21685669
        System.out.println(c3.hashCode());//21685669
        System.out.println(c4.hashCode());//21685669
    }
}

class User{
    private int id;
    private int age;

    public User() {
    }

    public User(int id, int age) {
        this.id = id;
        this.age = age;
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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                '}';
    }
    private void test(){

    }

    public void setAge(int age) {
        this.age = age;
    }
}



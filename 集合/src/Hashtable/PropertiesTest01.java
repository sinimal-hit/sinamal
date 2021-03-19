package Hashtable;

import java.util.Properties;

/*
Properties是一个Map集合,继承Hashtable,Properties的key和value都是String类型
Properties被称为属性类对象
Properties是线程安全的.
 */
public class PropertiesTest01 {
    public static void main(String[] args) {
        //创建一个Properties对象
        Properties pro = new Properties();
       //需要掌握Properties的两个方法,一个存,一个取
       pro.setProperty("username","root");
       pro.setProperty("password","123");

       //通过key取value
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");

        System.out.println(username);//root
        System.out.println(password);//123

    }
}

package com.doer;

import com.doer.di.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.text.Style;

public class MyTest03 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student2 = (Student) context.getBean("student");
        System.out.println(student2.getName());
    }
}

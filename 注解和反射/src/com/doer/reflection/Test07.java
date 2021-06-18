package com.doer.reflection;

public class Test07 {

    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类的加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);

        //获取系统加载器的服了加载器--->扩展类加载器
        ClassLoader parent = systemClassLoader.getParent();
        System.out.println(parent);

        //获取扩展类加载器父类加载器-->根加载器(引导类加载器)(C/c++写的)
        ClassLoader parentUnParent = parent.getParent();
        System.out.println(parentUnParent);


        //测试当前类是哪个加载器加载的  --->系统类加载器,也就是用户类加载器加载
        ClassLoader classLoader = Class.forName("com.doer.reflection.Test07").getClassLoader();
        System.out.println(classLoader);

        //测试JDK内置的类是谁加载的 -->根加载器加载
        ClassLoader classLoader1 = Object.class.getClassLoader();
        System.out.println(classLoader1); //null

        //如何获得系统类加载器可以加载的路径
        System.out.println(System.getProperty("java.class.path"));
        /*
        D:\java\jdk1.8.0_261\jre\lib\charsets.jar;
        D:\java\jdk1.8.0_261\jre\lib\deploy.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\access-bridge-64.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\cldrdata.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\dnsns.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\jaccess.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\jfxrt.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\localedata.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\nashorn.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\sunec.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\sunjce_provider.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\sunmscapi.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\sunpkcs11.jar;
        D:\java\jdk1.8.0_261\jre\lib\ext\zipfs.jar;
        D:\java\jdk1.8.0_261\jre\lib\javaws.jar;
        D:\java\jdk1.8.0_261\jre\lib\jce.jar;
        D:\java\jdk1.8.0_261\jre\lib\jfr.jar;
        D:\java\jdk1.8.0_261\jre\lib\jfxswt.jar;
        D:\java\jdk1.8.0_261\jre\lib\jsse.jar;
        D:\java\jdk1.8.0_261\jre\lib\management-agent.jar;
        D:\java\jdk1.8.0_261\jre\lib\plugin.jar;
        D:\java\jdk1.8.0_261\jre\lib\resources.jar;
        D:\java\jdk1.8.0_261\jre\lib\rt.jar;
        D:\IDEA\注解和反射\out\production\注解和反射;
        D:\IDEA\IDEA2020.1.3 下载及破解\install\IntelliJ IDEA 2020.1.3\lib\idea_rt.jar

         */

        
    }
}

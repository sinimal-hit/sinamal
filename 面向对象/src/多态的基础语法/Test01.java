package 多态的基础语法;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.concurrent.atomic.DoubleAccumulator;

/*
    多态的基础语法
    1、向上转型
        子 ----> 父（相当于自动类型转化）
    2、向下转型：
        父 ----> 子（相当于强制类型转换，需要加强制类型转换符）
    注意：java允许向上转型和向上转型，但是两种类型都需要具备继承关系
        但是自动类型转化是属于基本数据类型，引用数据类型不存在自动转型，只是相似
    3、什么是多态？
        多种形态，多种状态
        分析a2.move()；
            java 程序分为编译阶段和运行阶段
            编译阶段：
                编译器只知道a2的类型是Animal，所以编译器在检查语法的时候，会去Animal.class字节码文件中
                找move()方法，找到了，绑定上move()方法，编译通过，静态绑定成功（编译阶段属于静态绑定）
            运行阶段：
                运行阶段的时候，实际上在堆内存中创建的java对象是Cat对象，所以在move的时候，真正参与move的对象
                是一只猫，所以在运行阶段执行Cat对象的move()方法，这个过程属于运行阶段绑定，(运行阶段属于动态绑定)
       多态表示多种形态
            编译的时候一种形态
            运行的时候一种形态


     4、多态指的是：
        父类型引用指向子类型对象
        包括编译阶段和运行阶段
        编译阶段：绑定父类型中的方法
        运行阶段：绑定子类型中的方法

     5、什么时候使用“向下转型”？
        当需要访问子类中特有的方法，需要进行向下转型
 */
public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.move();//动物在飞翔

        Cat c1 = new Cat();
        c1.move();//cat在走路

        Bird b1 = new Bird();
        b1.move();//鸟儿在飞翔
        //-------------------------------------------------------------------------



        //代码可以这样写吗？
        /*
            1、Animal和Cat之间有继承关系
            2、Animal是父类，Cat是子类
            3、Cat is a Animal ，这句话能说通
            4、经过测试java在中支持这样一个语法，
                父类型的引用指向了子类型的对象。这种语法被称为向上转型
         */
        Animal a2 = new Cat();
        a2.move();
        Animal a3 = new Bird();
        a3.move();
        //Animal a4 = new Dog();  不兼容类型，Dog并没有继承Animal类，Dog无法转成Animal

        //----------------------------------------------------------------
        Animal a5 = new Cat();
        //分析这个程序为什么不执行？   分析程序一定要分析编译阶段的静态绑定和运行阶段的动态绑定
        //a5.catchMouse();

        //这里编译根本不会通过，因为Animal根本没有捉老鼠这个方法


        //如果非要a5去抓老鼠，这个时候就必须使用向下转型了
        //将Animal类型a5 转换为Cat类型，他俩之间存在这继承关系，编译并不会报错
        Cat x = (Cat)a5;
        x.catchMouse();//毛正在抓老鼠！！



        //---------------------------------------------------------------------------


        Animal a6 = new Bird();
//        Cat c2 = (Cat)a6;
//        c2.catchMouse();

        /*
            运行时出现异常：
                java.lang.ClassCastException  ：类型转换异常
         */
        //就需要instanceof运算符的参与，
        if(a6 instanceof Cat){
            Cat c3 = (Cat)a6;
            c3.catchMouse();
        }
    }
}

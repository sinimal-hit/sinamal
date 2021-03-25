package 泛型;

import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
JDK5.0之后推出的新特性:泛型
    1.泛型这种语法机制,只在程序的编译阶段起作用,只是给编译器参考的(运行阶段不会起作用)
    2.使用泛型的好处是什么?
        ①:集合中存储的元素统一了.
        ②:从集合中取出的元素类型是泛型的指定类型,不需要进行大量的"向下转型";

    3.泛型的缺点是什么?
        导致集合中的元素缺少多样性
        大多数业务中,集合中的元素类型还是统一的,所以泛型这种机制被大家同意认可
*/
public class GenericTest01 {
    public static void main(String[] args) {

        //不使用泛型机制,分析程序存在的缺点
        List myList = new ArrayList();
        //准备对象
        Cat c = new Cat();
        Bird b = new Bird();
        //将对象添加到集合当中
        myList.add(c);
        myList.add(b);

        //遍历集合, 取出Cat让它抓老鼠,去除Bird让它飞翔
        Iterator it = myList.iterator();
        while (it.hasNext()){
            //迭代器没有这个语法,通过迭代器取出来的就是Object
            // Animal a = it.next();

            Object obj =  it.next();
            //obj中没有move方法,无法调用,需要向下转型!
            if(obj instanceof  Animal){
                Animal a = (Animal)obj;
                a.move();
            }
        }

        /*
            使用JDK5之后的泛型机制.
            使用泛型List<Animal>之后,表示List集合只允许存储Animal类型的数据
            用泛型来指定集合中存储的数据类型
         */
        List<Animal> list = new ArrayList<Animal>();

        //指定集合中只能存储Animal,存储String就编译报错了,使用泛型之后,集合中的元素就更加统一了
        //list.add("110");

        Cat cat = new Cat();
        Bird bird = new Bird();
        list.add(cat);
        list.add(bird);

        //获取迭代器
        //表示迭代器迭代的是Animal类型
        Iterator<Animal> iterator = list.iterator();
        while (iterator.hasNext()){
            //使用泛型之后,每一次迭代返回的数据都是Animal类型.
            Animal animal =  iterator.next();
            //这里不需要进行强制类型转化,直接调用
            animal.move();
        }
        //但是如果需要调用子类的方法,还是需要"向下转型的"
        Iterator<Animal> iterator1 = list.iterator();
        while (iterator1.hasNext()){
            Animal a1 = iterator1.next();
            if(a1 instanceof Cat){
                Cat c1 = (Cat)a1;
                c1.catchMouse();
            }else {
                Bird b1 = (Bird)a1;
                b1.fly();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("动物在移动");
    }
}

class Cat extends Animal{
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("鸟儿在飞翔");
    }
}

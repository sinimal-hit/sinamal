package 多态的基础语法;

//猫类，动物类的子类
public class Cat extends Animal{
    public void move(){
        System.out.println("cat在走路");
    }
    //猫除了move之外，还有自己特有的行为，例如抓老鼠
    public void catchMouse(){
        System.out.println("猫正在抓老鼠");
    }
}

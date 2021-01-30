package 方法的覆盖;
/*
    使用方法覆盖
 */
public class OverrideTest02 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.move();
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在跑步");
    }
}

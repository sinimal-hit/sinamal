package 方法的覆盖;
/*
    当前程序鸟儿在调用父类方法的时候最好的是输出“鸟儿在飞翔”；但是当前程序执行move()方法输出的结果是“动物在移动”
    说明鸟儿从父类继承过来的方法不太实用，需要改进
 */
public class OverrideTest01 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.move();
    }

}
class Animal{
    //移动
    public void move(){
        System.out.println("动物在移动！");
    }
}
class Bird extends Animal{
    //子类继承父类之后，有一些行为不需要改进，但是有一些行为需要改进
    //鸟儿在移动的时候我需要输出鸟儿在飞翔
}

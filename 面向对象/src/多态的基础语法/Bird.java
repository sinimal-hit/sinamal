package 多态的基础语法;

public class Bird extends Animal {
    public void move(){
        System.out.println("鸟儿在飞翔");
    }
    //鸟儿也有自己特有的方法
    public void sing(){
        System.out.println("鸟儿是在歌唱");
    }
}

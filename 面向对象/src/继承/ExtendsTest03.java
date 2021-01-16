package 继承;

public class ExtendsTest03 {
    public static void main(String[] args) {
        Animal animal = new Animal();

    }
}
class Animal{
    String name;
    public void move(){
        System.out.println(name+"正在移动");
    }

}
class Cat extends Animal{

}
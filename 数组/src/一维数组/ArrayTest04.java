package 一维数组;
/*
    数组中存储引用数据类型
 */
public class ArrayTest04 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        Animal[] animals = {a1,a2};
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        //猫类继承动物之后可以放在父类型的应用的数组
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Animal[] animals1 = {c1,c2};
        animals1[0].move();

        Animal[] animals2 = {new Cat(),new Bird()};
        for (int i = 0; i < animals.length; i++) {
            animals2[i].move();
            if(animals2[i] instanceof Cat){
                Cat c = (Cat)animals2[i];
                c.sleep();
            }else {
                Bird b = (Bird) animals2[i];
                b.sing();
            }
        }
    }
}
class Animal{
    public void move(){
        System.out.println("Animal move.....");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("cat move.....");
    }

    public void sleep(){
        System.out.println("cat is sleeping....");
    }

}
class Bird extends Animal{
    public void move(){
        System.out.println("bird move.....");
    }
    public void sing(){
        System.out.println("bird is singing");
    }
}

package 构造方法;

public class ConstructionMethodTest02 {
    public static void main(String[] args) {
        User user1 = new User();

        User user2 = new User("张三",3,32);
        System.out.println(user1.age);
        System.out.println(user1.id);
        System.out.println(user1.name);
        System.out.println("==============");
        System.out.println(user2.age);
        System.out.println(user2.id);
        System.out.println(user2.name);
    }
}
class User{
    int id;
    String name;
    int age;
    public User(){

    }
    public User(int id,String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public User(String name,int id,int age){
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public User(int id,int age,String name){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

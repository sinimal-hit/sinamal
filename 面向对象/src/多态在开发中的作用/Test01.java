package 多态在开发中的作用;

import javax.xml.crypto.Data;

public class Test01 {
    public static void main(String[] args) {
        Master master = new Master();
        Dog dog = new Dog();
        master.feed(dog);
    }
}

package Object类;
/*
    当一个类中有其他类的引用作为该类的属性,如何对equals重写
 */
public class Test03 extends Object {
    public static void main(String[] args) {
       People p1 = new People("张三",19,new Address("西安","长虹街道","111"));
       People p2 = new People("张三",19,new Address("西安","长虹街道","111"));
       System.out.println(p1.equals(p2));
    }
}
class People{
     String name;
     int age;
     Address addr;
    //构造方法
    public People() {
    }

    public People(String name, int age, Address addr) {
        this.name = name;
        this.age = age;
        this.addr = addr;
    }
    //重写toString()方法
    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addr=" + addr +
                '}';
    }
    //重写equals()方法
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof People)) return false;
        if(this == obj) return true;
        People people = (People)obj;
        if(this.age == people.age && this.name.equals(people.name) && this.addr.equals(people.addr)){
            return true;
        }
        return false;
    }

}
class Address{
     String city;//城市
     String street;//街道
     String zipcode;//邮编

    //构造方法
    public Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

    //实现toString()

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
    public boolean equals(Object obj){
        if(obj == null || !(obj instanceof Address)) return false;
        if(this == obj) return true;
        Address address = (Address)obj;
        if(this.city.equals(address.city) && this.street.equals(address.street)
        && this.zipcode.equals(address.zipcode)) return true;
        return false;
    }

}

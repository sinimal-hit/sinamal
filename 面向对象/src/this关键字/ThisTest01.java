package this关键字;

public class ThisTest01 {
    public static void main(String[] args) {
        Customer c = new Customer("张三");
        c.shopping();
        Customer d = new Customer("李四");
        d.shopping();
    }
}
class Customer{
    String name;
    public Customer(){

    }
    public Customer(String ss){
        name = ss;
    }
    public void shopping(){
        System.out.println(this.name+"正在购物！");
        //这代表的就是当前对象，this.省略的话就是默认访问当前对象的“name”
    }
}

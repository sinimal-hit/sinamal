package 面向对象;
/*
    c.d.i
 */
public class UserTest {
    //那这样说String 的这个变量也是引用对吧，为啥？，因为字符串是存储在字符串常量池中的，而这个变量就是个地址，指向
    //字符串常量池中的字符串。
    public static void main(String[] args) {
        //住址对象
        Address address = new Address();
        address.city = "北京";
        address.street = "大兴区";
        address.zipcode = "1234324";

        //用户对象
        User user = new User();
        System.out.println(user.id);//0
        System.out.println(user.name);//null
        System.out.println(user.addr);//null
        user.id = 11111;
        user.name = "张安";
        user.addr = address;
        System.out.println(user.id);//11111
        System.out.println(user.name);//张安
        System.out.println(user.addr.city +","+ user.addr.street + "," + user.addr.zipcode);
        //北京 大兴区 1234324


        //将user.addr.city这个代码进行拆分
        //之所以user.addr.city能够使用，是因为user.addr的放回置类型是Address类型，而Address里面确实有city的属性。
        Address ad = user.addr;//user.addr需要用Address的引用类型变量来接收；
        String zhuZhi = ad.city; //然后将city 的值传给 String类型的变量
        System.out.println(zhuZhi);

    }
}

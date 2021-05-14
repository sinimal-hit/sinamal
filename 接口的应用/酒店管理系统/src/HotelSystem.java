import java.util.Scanner;

/*
    为酒店编写一个程序酒店管理系统,模拟订房,退房,打印所有房间状态等功能
    1.该系统的用户是:酒店前台
    2.酒店使用一个二二维数组来模拟,"Room[][] rooms"
    3.酒店中的每一个房间应该是一个java对象:Room
    4.每一个房间Room应该有:房间号,房间类型属性.房间是否空闲属性
    5.系统应该对外提供的功能
        可以预定房间:用户输入房间编号,订房
        可以退房,用户输入房间编号,退房
        还可以查看某个房间的状态
        可以查看所有房间的状态,:用户输入某个指令应该可以查看所有房间状态

 */
public class 2211
        HotelSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Scanner scanner = new Scanner(System.in);
        while (true){
            /**
             * 酒店管理系统输出一个欢迎页面
             */
            int choice = hotel.menu();
            if(choice < 0 || choice > 4
            ){
                System.out.println("你的选择有误,请重新输入:['1' '2' '3' '4' '0']");
                continue;
            }
            if(choice == 1){
                // '1'表示查看房间状态
                hotel.print();
            }
            if(choice == 2){
                while (true){
                    //'2'表示订房
                    System.out.println("请输入需要订购房间的房间号:101 ~ 110 , 201 ~ 210 , 301 ~ 310");
                    int num = scanner.nextInt();
                    //判断输入的房间号是否成立
                    if(num < 101 || (num > 110 && num < 201) || (num > 210 && num < 301) || num > 310 ){
                        System.out.println("您输入的房间号有误,请重新输入:");
                        continue;
                    }
                    hotel.order(num);
                    break;

                }
            }
            if(choice == 3){
                //退房,需要考虑,前台的输入是否正确,首先房间号需要在范围之内,然后输入的房间号不能时空闲状态
                System.out.println("请输入需要退房的房间号:101 ~ 110 , 201 ~ 210 , 301 ~ 310");
                int num = scanner.nextInt();
                if(num < 101 || (num > 110 && num < 201) || (num > 210 && num < 301) || num > 310){
                    System.out.println("您输入的房间号有误,请重新输入:");
                    continue;
                }
                //怎么判断这个输入的这个房间是被占用还是闲呢,也就是怎么调用酒店的一个属性,房间数组,
                if(hotel.queryState(num)){
                    System.out.println("您输入的房间号是空闲状态,无需退房,请您重新输入:");
                    continue;
                }
                hotel.exit(num);
            }
            if(choice == 4){
                System.out.println("请输入查询的房间号:");
                int num = scanner.nextInt();
                if(num < 101 || (num > 110 && num < 201) || (num > 210 && num < 301) || num > 310){
                    System.out.println("您输入的房间号有误,请重新输入:");
                    continue;
                }else {

                    System.out.println(num+"房间:"+(hotel.queryState(num)?"空闲状态":"占用状态")+"");

                }
            }
            if(choice == 0){
                System.out.println("即将退出系统,再见!~~~");
                break;
            }
        }

    }
}


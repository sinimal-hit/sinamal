package 二维数组;

import java.util.Arrays;
import java.util.Objects;
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
public class ArrayHomeWork2 {
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
class Hotel{
    /**
     * 二维数组,模拟房间
     */
    private Room[][] rooms;

    //构造方法
    public Hotel() {
        /**
         * 房间编号
         * 1楼:101 102 103 104 105
         * 2楼:201 202 203 204 205
         * 3楼:301 302 303 304 305
         */
        rooms = new Room[3][10];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if(i == 0){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",true);

                }else if(i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",true);

                }else {
                    rooms[i][j] = new Room((i+1)*100+j+1,"总统套房",true);

                }
            }
        }
    }
    //set get

    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

    //酒店系统说明
    public int menu(){
        System.out.println("==============================================");
        System.out.println("==============================================");
        System.out.println("=   欢迎来到酒店管理系统,请根据以下操作来执行您的选择  =");
        System.out.println("=             1 :查看房间列表                  =");
        System.out.println("=             2 :订房                        =");
        System.out.println("=             3 :退房                        =");
        System.out.println("=             4 :查看房间状态                  =");
        System.out.println("=             0 :退出系统                     =");
        System.out.println("==============================================");
        System.out.println("==============================================");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的选择:['1' '2' '3' '4' '0']");
        int choice = scanner.nextInt();
        return choice;
    }
    //打印房间状态(列表)
    public void print(){
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(Arrays.toString(rooms[i]));
        }
    }
    public Hotel(Room[][] rooms) {
        this.rooms = rooms;
    }

    /**
     * 查看房间状态,返回一个值
     * @param roomNo
     */
    public boolean queryState(int roomNo){
        //订房最主要的是将对象的空闲变为占用
        Room room = rooms[roomNo/100-1][roomNo%100 -1];
        boolean flag =  room.getIsIdle();
        return flag;
    }

    /**
     * 订房
     * @param roomNo
     */
    public void order(int roomNo){
        Room room= rooms[roomNo/100-1][roomNo%100 -1];
        room.setIsIdle(false);
        System.out.println(roomNo + "已定房");

    }
    /**
     * 退房
     * @param roomNo
     */
    public void exit(int roomNo){
        Room room= rooms[roomNo/100-1][roomNo%100 -1];
        room.setIsIdle(true);
        System.out.println(roomNo + "已退房");
    }
}
class Room{

    /**
     * 房间编号
     * 1楼:101 102 103 104 105
     * 2楼:201 202 203 204 205
     * 3楼:301 302 303 304 305
     */
    private int roomNumber;
    /**
     * 房间类型,标准间 单人间 总统套房
     */
    private String type;
    /**
     * 房间状态
     * true 空闲
     * false 占用
     */
    private boolean idle;

    //构造方法


    public Room(int roomNumber, String type, boolean isIdle) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.idle = isIdle;
    }

    public Room() {
    }

    //set get


    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getIsIdle() {
        return idle;
    }


    public void setIsIdle(boolean isIdle) {
        this.idle = isIdle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return roomNumber == room.roomNumber &&
                idle == room.idle &&
                Objects.equals(type, room.type);
    }


    @Override
    public String toString() {
        return "["+roomNumber+","+type+","+(idle ?"空闲":"占用")+"]";
    }
}

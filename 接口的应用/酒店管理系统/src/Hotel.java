import java.util.Arrays;
import java.util.Scanner;

class Hotel {
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

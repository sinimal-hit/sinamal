import java.util.Objects;

class Room {

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

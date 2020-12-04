import com.sun.corba.se.impl.encoding.CDROutputObject;

import java.rmi.ConnectIOException;

public class TestInterface {
    public static void main(String[] args) {
        ChangFangxing c = new ChangFangxing();
        c.setLength(5);
        c.setWidth(5);
        System.out.println("长方形的周长是"+c.getZhouchang()+"面积是"+c.getMianji());
        Cirle d = new Cirle(4);
        System.out.println("元的周长是"+d.getZhouchang()+"面积十"+d.getMianji());
    }
}
interface Shape{
    static double PI = 3.1415;
    double getZhouchang();
    double getMianji();
}
class ChangFangxing implements Shape{
    private double length;
    private double width;
    public ChangFangxing(){

    }
//    public ChangFangxing(double length,double width){
//        this.length = length;
//        this.width = width;
//    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getZhouchang() {
        return (length+width)*2;
    }

    @Override
    public double getMianji() {
        return length*width;
    }
}
class Cirle implements Shape{
    private double radius;
    public Cirle(double r) {
        radius = r;
    }


    @Override
    public double getZhouchang() {
        return 2*PI*radius;
    }

    @Override
    public double getMianji() {
        return PI*radius*radius;
    }
}

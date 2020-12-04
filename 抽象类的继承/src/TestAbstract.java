import javafx.scene.shape.Shape;

public class TestAbstract {
    public static void main(String[] args) {
        Changfangxing u = new Changfangxing(10,10);
        System.out.println("长方形的周长是"+u.getZhouchang()+"长方形的面积是"+u.getMianji());
        Yuan k = new Yuan(2);
        System.out.println("圆的周长是"+k.getZhouchang()+"圆的面积是"+k.getMianji());
    }
}
abstract class Shape1{
    public static final double PI = 3.1412;
    public abstract double getZhouchang();
    public abstract double getMianji();
}
class Changfangxing extends Shape1{
    private double chang ;
    private double kuan;
    public Changfangxing(double chang,double kuan){
        this.chang = chang;
        this.kuan = kuan;
    }
    @Override
    public double getZhouchang() {
        return (chang+kuan)*2;
    }

    @Override
    public double getMianji() {
        return chang*kuan;
    }
}
class Yuan extends Shape1{
    private double banjing;
    public Yuan(double banjing){
        this.banjing = banjing;
    }
    @Override
    public double getMianji() {
        return PI*banjing*banjing;
    }

    @Override
    public double getZhouchang() {
        return 2*PI*banjing;
    }
}


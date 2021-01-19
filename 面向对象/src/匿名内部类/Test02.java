package 匿名内部类;
/*
    匿名内部类的使用
 */
public class Test02 {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        //匿名内部类,这个类实现了接口中的方法,
        mm.mySum(new Computer() {
            @Override
            public int sum(int m, int n) {
                return m + n;
            }
        },4,5);
    }
}

//定义一个接口,有一个求和的方法
interface Computer{
    int sum(int m,int n);
}
//定义一个数学类,里面有求数学的求和方法
class MyMath{
    public void mySum(Computer c,int m,int n){
         c.sum(m,n);
        System.out.println(m + "+" + n + "=" + c.sum(m,n));
    }
}
package 匿名内部类;

public class Test01 {
    //该类在类的内部,所以称为内部类
    //由于前面有static,所以成为静态内部类
    static class Inner1{

    }
    //该类在类的内部,没被static修饰,所以称为实例内部类
    class Inner2{

    }
    public void doSome(){
        //该类在类的内部,并且是在方法内部,所以是局部内部类
        class Inner3{

        }
    }

    public void doOther(){

    }
}

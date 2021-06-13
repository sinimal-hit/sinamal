package java.lang;

//双亲委派机制
/*
双亲委派机制:安全
1APP--->EXT---BOOT(最终执行跟加载器的)

程序运行的时候,类会先被加载到JVM中,加载的时候首先会去根加载器中寻找,也就是rt.jar包
    如果跟加载器中没有找到会去ext中查找,最后再去APP用户应用程序加载器中查找
 */
public class String {
    @Override
    public String toString() {
        return "hello";
    }

    public static void main(String[] args) {
        String s = new String();
        s.toString();
    }
    //在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
}

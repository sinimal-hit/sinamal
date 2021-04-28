package 接口例题;
/*
    设计一个电脑类,属性随意,并且对属性进行私有化,对外提供get  set方法
    设计一个可插拔的接口,InsertDrawable,该接口有什么方法自行定义
    设计一个鼠标类,实现InsertDrawable接口,并实现方法
    设计一个键盘类,实现InsertDrawable接口,并实现方法
    设计一个显示器类,实现InsertDrawable接口,并实现方法
    设置一个打印机类,实现InsertDrawable接口,并实现方法

    在电脑类中有InsertDrawable接口属性,可以让笔记本可插拔鼠标,键盘,显示器,打印机等

    编写测试程序,创建多个对象,演示接口的作用
 */
public class InterfaceTest01 {
    public static void main(String[] args) {
        InsertDrawable insertDrawable = new JianPan();
        //这里再创建Computer对象的时候一定要要把Computer里的属性赋值
        Computer computer = new Computer(insertDrawable);
        computer.operate();
    }
}

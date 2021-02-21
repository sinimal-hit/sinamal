package 二维数组;

/*
    编写程序,使用一维数组,模拟栈数据结构
    要求:
        1.这个栈可以存储java中的任何引用类型的数据
        2.在栈中提供push方法,模拟压栈(栈满了,有提示信息)
        3.在栈中提示pop方法,模拟弹栈(栈空了,有提示信息)
        4.编写测试程序,new栈对象,调用pop放啊来模拟压栈弹栈的动作.
 */
public class ArrayHomeWork {
    public static void main(String[] args)  {
       MyStack myStack = new MyStack();
        try {
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());
            myStack.push(new Object());

        } catch (MyStackOperationException e) {
            System.out.println(e.getMessage());
        }
        //弹栈
        try{
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
            myStack.pop(new Object());
        }catch (MyStackOperationException e){
            System.out.println(e.getMessage());
        }
    }
}
class MyStack {
    //提供一个数组来存储栈中的元素
    private Object[] elements;
    //栈帧(永远指向栈顶部的元素),int index = 0 每加一个元素,栈帧+1,没减一个元素,栈帧 -1
    int index;
    //构造方法

    public MyStack() {
        this.elements = new Object[10];
        index = -1;
    }

    public MyStack(Object[] elements, int index) {
        this.elements = elements;
        this.index = index;
    }

    public Object[] getElements() {
        return elements;
    }

    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    //push方法(方法压栈),栈中表示栈中多一个元素,但是如果栈满了,压栈失败,参数和返回值类型自己定义
    public void push(Object obj) throws MyStackOperationException {
        if(index >= elements.length-1){
            MyStackOperationException e = new MyStackOperationException("栈已满,压栈失败");
            //将异常抛出去
            throw e;
        }
        index++;
        System.out.println("压栈成功"+ obj +"index --->"+index);
    }

    //pop方法(弹栈),表示栈中少以一个元素,但是如果栈中已经空了,弹栈失败,参数和返回值类型自己定义
    public void pop(Object obj) throws MyStackOperationException {
        if(index < 0){
            throw new MyStackOperationException("弹栈失败,栈已空");
        }
        index--;
        System.out.println("弹栈成功"+obj+"index--->"+index);
    }
    //main方法

}

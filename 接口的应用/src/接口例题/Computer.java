package 接口例题;
/*
    电脑类,是接口的调用者,我要通过接口来实现接口的方法
 */
public class Computer {
    private InsertDrawable insertDrawable;
    //构造方法
    public Computer() {
    }

    public Computer(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }
    //get set

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    //电脑可以operate方法来完成硬件的操作
    public void operate(){
        insertDrawable.use();
    }
}

package 实现链表的基础操作1;

public class Node {
    public int val;

    public Node next = null;

    public Node(int val){
        this.val = val;
    }
    @Override
    public String toString(){
        return "[" + val + "]";
    }

}

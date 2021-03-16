package danlink;
/*
单链表中的节点
    节点是单项链表的基本单元
    每一个节点Node都有两个属性
        一个属性:是存储的数据
        另一个数据:是下一个节点的内存地址
 */
public class Node {
    //存储的数据
    Object data;

    //下一个节点的内存地址
    Node next;

    //构造方法
    public Node() {
    }

    public Node(Object element, Node next) {
        this.data = element;
        this.next = next;
    }
}

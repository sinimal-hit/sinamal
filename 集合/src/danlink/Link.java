package danlink;
/*
    链表类
 */
import com.sun.xml.internal.bind.marshaller.NoEscapeHandler;

public class Link {
    //头节点
    Node header = null;

    int size = 0;
    //向链表中添加元素的方法(向末尾添加)
    public void add(Object data){
        //创建一个新的节点对象
        //让之前的单链表的末尾节点next指向新的节点对象
        //有可能这个元素是第一个,也可能是第二个,也可能是第三个.

        if(header == null){
            //说明还没有节点,new一个新的节点对象作为头节点,这个时候的头节点既是一个头节点,又是一个末尾节点
            new Node(data,null);
        }else {
            //说明头节点不是null;  找出当前的末尾节点,让当前末尾节点的next是新节点
            Node currentLastNode = findLast(header);
            currentLastNode.next = new Node(data,null);
        }
    }

    /**
     * 专门查找末尾节点的方法
     * @param header 节点
     * @return
     */
    private Node findLast(Node header) {
        if(header.next == null){
            //如果一个节点的next是null,说明这个节点就是末尾节点
            return header;
        }
        return findLast(header.next);//递归来寻找
    }

    //删除链表中某个数据的方法
    public void remove(Object obj){

    }

    //修改链表中某个数据的方法
    public void modify(Object obj){

    }

    //查找链表某个元素的方法
    public int find(Object obj){
        return 1;
    }
}

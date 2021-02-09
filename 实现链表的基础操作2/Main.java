package 实现链表的基础操作2;

public class Main {
    //创建不带傀儡节点的链表
    public static Node creatList(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    //创建带傀儡节点的链表
    public static Node creatListDummy(){
        Node dummy = new Node(0);
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return dummy;
    }

    //求链表大小
    public static int size(Node head){
        int size = 0;
        for(Node cur = head; cur != null;cur = cur.next){
            size++;
        }
        return size;
    }
    //遍历不带傀儡节点的链表
    public static void print(Node head){
        for (Node cur = head ; cur != null; cur = cur.next){
            System.out.println(cur.value);
        }
    }

    //遍历带傀儡节点的链表
    public static void printWithDummy(Node head){
        for(Node cur =head.next; cur != null; cur = cur.next){
            System.out.println(cur.value);
        }
    }

    //末尾插入一个节点
    public static Node insertTail(Node head, int value){
        Node newNode = new Node(value);
        //先判断都节点是否为空,空的情况直接将该节点放在第一个节点上
        if(head == null){
            return newNode;
        }

        Node prev = head;
        while(prev.next != null){
            prev = prev.next;
        }
        //现在将最后一个节点的next指向新插入的节点,现在prev就是最后有一个节点,需要将新加入的节点地址赋值给prev
        newNode.next = prev.next;
        prev.next = newNode;
        return head;

    }

    //删除节点,按照节点中的值来删除....
    public static Node remove(Node head, int value){
        Node prev = head;
        while(prev != null && prev.next != null && prev.next.value != value){
            prev = prev.next;
        }
        //如果循环结束了说明prev.next.value,指向需要删除的元素的前一个节点,或者为null;
        if(prev == null || prev.next == null){
            return null;
        }

        Node toDelete = prev.next;
        prev.next = toDelete.next;
        return head;
    }

    //删除元素,按照位置来删除
    public static Node remove(Node head, Node toDelete){
        Node prev = head;
        if(head == null){
            return null;
        }
        while ((prev != null && prev.next != toDelete)){
            prev = prev.next;
        }

        //没找到
        if(prev == null){
            return null;
        }
        prev.next = toDelete.next;
        return head;
    }

    //删除元素,按照索引来删除
    public static Node removeWithIndex(Node head, int index) {
        if(index < 0 || index >= size(head)){
            return null;
        }
        if(index == 0){
            head = head.next;
            return head;
        }
        Node prev = head;
        for (int i = 0; i < index -1; i++) {
            prev = prev.next;
        }
        Node toDelete = prev.next;
        prev.next = toDelete.next;
        return head;
    }

    public static void main(String[] args) {
        Node head = creatList();
        //向链表末尾插入元素
        head = insertTail(head,5);
        //print(head);//1 2 3 4 5

        //根据值来删除元素
        remove(head,5);
        //print(head);//1 2 3 4

    }

}

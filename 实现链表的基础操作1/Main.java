package 实现链表的基础操作1;
/*
通过遍历，打印链表的每个元素。
通过遍历，找到链表的最后一个结点。
通过遍历，找到链表的倒数第二个结点。
通过遍历，找到链表的第 n 个结点。（链表的长度 >= n)
通过遍历，计算链表中元素的个数。
通过遍历，找到链表中是否包含某个元素。
 */
public class Main {
    public static Node createList(){
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

    public static void main(String[] args) {
        Node head = createList();
        //通过遍历，打印链表的每个元素。
        for(Node node = head;node != null ;node = node.next){
            System.out.println(node.val);
        }

        //通过遍历，找到链表的最后一个结点。
        Node node = head;
        while (node != null && node.next!= null){
            node = node.next;
        }
        System.out.println(node.val);

        //通过遍历，找到链表的倒数第二个结点。
        Node node1 = head;
        while (node1 != null && node1.next != null && node1.next.next != null){
            node1 = node1.next;
        }
        System.out.println(node1);
        //通过遍历，找到链表的第 n 个结点。（链表的长度 >= n)
        int N = 4;//表示第四个节点
        Node node2 = head;
        for(int i = 1; i < N ;i++){
            node2 = node2.next;
        }
        System.out.println(node2);

        //通过遍历，计算链表中元素的个数。
        int count = 0;
        for(Node node3 = head ; node3 != null;node3 = node3.next){
            count++;
        }
        System.out.println(count);

        //通过遍历，找到链表中是否包含某个元素。
        int toFind = 4;
        Node node3 = head;
        for(;node3 != null;node3 = node3.next){
            if(node3.val == toFind){
                break;
            }
        }
        if(node3 != null){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }


    }
}

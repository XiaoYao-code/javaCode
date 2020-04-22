package code422;
class Node{
    public int data;
    public Node next;
    public Node(int data){
       this.data=data;
       this.next=null;
    }
}

public class LinkedList {
      public Node head;//保存头节点的引用
    //单链表的头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if (head==null){
            this.head=node;
            return;
        }
       node.next=this.head;
        this.head=node;
    }
    //打印单链表
    
}

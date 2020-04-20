package code420;
 class Node{
    public int data ;
    public Node next;
    public Node(int data){
     this.data=data;
     this.next=null;
    }
}
public class MyLikedList {
    public Node head;//保存单链表的头节点的引用
    //头插法
    public void addFirst(int data){
        Node node=new Node(data);
        if(this.head==null){
            //第一次插入节点
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }
    //打印disPlay
    public void disPlay(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
    //尾插法 addLast
    public void addLast(int data){
        Node node=new Node(data);
        if (this.head==null){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while (cur!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    public boolean contains(int key){
        if (this.head==null){
            throw new RuntimeException("链表为空");
        }
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    public int size(){
        int num=0;
        Node cur=this.head;
        while (cur!=null){
            num++;
            cur=cur.next;
        }
        return num;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        if(index == 0) {
            this.addFirst(data);
            return;
        }
        if(index == this.size()) {
            this.addLast(data);
            return;
        }
        //先找到  index位置的前一个节点的地址
        Node cur = searchIndex(index);
        //进行插入
        Node node=new Node(data);
        node.next=cur.next;
        cur.next=node;
    }

    private Node searchIndex(int index) {
        //1、对index进行合法性检查
        if(index <0 ||index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        for (int i=0;i<index-1;i++){
            cur=cur.next;
        }
        return cur;
    }

}

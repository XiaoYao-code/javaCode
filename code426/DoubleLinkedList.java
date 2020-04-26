package code426;
//无头双向链表实现
class Node{
    public int data;
    public Node next;
    public Node prev;
    public  Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

public class DoubleLinkedList {
    public Node head;//标志双向链表的头
    public Node tail;//标志双向链表的尾
    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.tail = node;
            this.head = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }
    // 尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if (this.head == null) {
            this.tail = node;
            this.head = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail=node;
        }
    }
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    //找位置
    private Node search(int index){
        Node cur = this.head;
        for (int i = 0; i < index; i++) {
            cur=cur.next;
        }
        return cur;
    }
    // 任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data){
        this.checkIndex(index);
        if (this.head==null){
            this.addFirst(data);
        }
        if (index==this.size()-1){
            this.addLast(data);
        }
        Node node = new Node(data);
        Node cur = this.search(index);
        cur.prev.next=node;
        node.prev=cur.prev;
        node.next=cur;
        cur.prev=node;
    }

    // 查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key)
                return true;
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字为key的节点
    public int remove(int key){
            Node cur = this.head;
            while (cur != null) {
                if(cur.data == key) {
                    int oldData = cur.data;
                    if(cur == this.head) {
                        this.head=this.head.next;
                        cur.prev=null;
                    }else if (cur==this.tail){
                        cur.prev.next=null;
                       this.tail=cur.prev;
                    }else {
                        cur.prev.next=cur.next;
                        cur.next.prev=cur.prev;
                    }
                    return cur.data;
                }
                cur = cur.next;
            }
            return -1;
        }
    // 删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head=this.head.next;
                    cur.prev=null;
                }else if (cur==this.tail){
                    cur.prev.next=null;
                    this.tail=cur.prev;
                }else {
                    cur.prev.next=cur.next;
                    cur.next.prev=cur.prev;
                }
            }
            cur = cur.next;
        }
    }
    // 得到单链表的长度
    public int size() {
        Node cur = this.head;
        int len = 0;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.println(cur.data+" ");
            cur=cur.next;
        }
    }

    //清空链表
    public void clear(){
        while (head!=null){
            Node cur=this.head;
             this.head.prev=null;
             this.head.next=null;
             this.head=cur;
        }
        this.tail=null;
    }
}

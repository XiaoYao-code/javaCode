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
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.println(cur.data);
            cur=cur.next;
        }
    }
    //尾插法
    public void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if(cur==null){
            this.head=node;
            return;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }
    //查找一个单链表中是否存在数据toFind
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if (cur.data==key){
                return true;
            }
            cur=cur.next;//如果把if (cur.data==key){return true;}放在后面，那么实际上检测的cur的下一个元素的data是否等于key
                         // 应该先判断，再把cur的值改为下一个节点
        }
        return false;
    }
    //得到链表的长度
    public int size(){
        int length=0;
        Node cur=this.head;
        while (cur!=null){
          length++;
          cur=cur.next;
        }
        return length;
    }
    //寻找一个位置index的前驱
    private Node searchIndexpre(int index){
        if (index<0||index>this.size()){
            throw new RuntimeException("位置不合法");
        }
        Node cur=this.head;
        for (int i = 0; i <index-1 ; i++) {
            cur=cur.next;
        }
        return cur;
    }
    //在index位置插入节点，数值域为data
    public void addIndex(int index,int data){
        Node node=new Node(data);
        if (index==0){
            addFirst(data);
            return;
        }
        if (index==size()){
            addLast(data);
            return;
        }
         Node cur=searchIndexpre(index);
        node.next=cur.next;
        cur.next=node;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
       Node cur=this.head;
       if (cur.data==key){
           this.head=cur.next;
           return;
       }
       while (cur.next!=null){
           if (cur.next.data==key){
            cur.next=cur.next.next;
            break;
           }
           cur=cur.next;
       }
    }
    //删除所有值为key的节点
    public void removeAllKey(int key){
        while (this.head.data==key){//把所有头节点值域等于data的全部删除
            this.head=this.head.next;
        }
        Node cur=this.head;
        Node cur1=this.head.next;
        while (cur1.next!=null){
            if (cur1.data==key){
                cur.next=cur1.next;
                cur1=cur1.next;
            }else {
                cur=cur.next;
                cur1=cur1.next;
            }
            if (cur1.data==key){
                cur.next=null;
            }
        }
    }
    //清空单链表
    public void clear(){
        this.head=null;
    }
}



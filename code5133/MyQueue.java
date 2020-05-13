package code513;
class Node{
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}
public class MyQueue {
    Node front=null;
    Node rear=null;
    int size=0;
    public boolean offer(int val){
        Node node=new Node(val);

        if (size==0){
            this.front=node;
            this.rear=node;
            this.size++;
        }
        this.rear.next=node;
        this.rear=node;
        this.size++;
        return true;
    }
}

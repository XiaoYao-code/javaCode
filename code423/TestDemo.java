package code423;

public class TestDemo {
    public static void main(String[] args) {
        LinkedList myLinkedList=new LinkedList();
        myLinkedList.addLast(70);
        myLinkedList.addLast(20);
        myLinkedList.addLast(70);
        myLinkedList.addLast(70);
        myLinkedList.addLast(50);
        myLinkedList.addLast(70);
        myLinkedList.addLast(70);
        myLinkedList.display();
        System.out.println("-----------");
        myLinkedList.removeAllKey(70);
        myLinkedList.display();
    }

}

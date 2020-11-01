package code426;



public class TestDemo {
    public static void main(String[] args) {
        DoubleLinkedList mydoubleLinkedList=new DoubleLinkedList();
        mydoubleLinkedList.addLast(5);
        mydoubleLinkedList.addLast(5);
        mydoubleLinkedList.addLast(5);
        mydoubleLinkedList.addLast(5);
        mydoubleLinkedList.addLast(5);
        mydoubleLinkedList.removeAllKey(5);
        mydoubleLinkedList.display();

    }
}

package code420;

public class TestDemo {
    public static void main(String[] args) {
        MyArrayList  arr=new MyArrayList();
        arr.add(0,4);
        arr.add(1,15);
        arr.add(2,3);
        arr.add(3,9);
       // arr.disPlay();
       // boolean s=arr.contain(15);
       // System.out.println(s);
       //int s= arr.search(15);
        //System.out.println(s);
        //arr.remove(15);
       // arr.disPlay();
       // arr.setPos(3,10);
       // arr.setPos(6,10);//出现异常
        //int s=arr.getPos(3);
       // System.out.println(s);
      //  int s=arr.getSize();
        //System.out.println(s);
       // arr.clear();
        //arr.disPlay();
        arr.remove(9);
        arr.disPlay();
    }
}

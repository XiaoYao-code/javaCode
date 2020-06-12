package code612;

public class Test {
    public   final static native int w();
    public static void main1(String[] args) {
        byte b1=1,b2=2,b3,b6;
        final  byte b4=4,b5=6;
        b6=b4+b5;
        //b3=(b1+b2);
        //System.out.println(b3+b6);
    }

    public static void main2(String[] args) {

        Object o=new Object(){
            public boolean equals(Object ojb){
                return true;
            }
        };
        System.out.println(o.equals("Fred"));
    }

    public static void main(String[] args) {

    }
}

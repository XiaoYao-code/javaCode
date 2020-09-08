package code98;

public class OJ {
    static boolean foo(char c)
    {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i=0;
        i=i++;
        System.out.println(i);
    }
    public static void main2( String[] argv )
    {
        int i = 0;
        for ( foo('A'); foo('B') && (i < 2); foo('C'))
        {
            i++ ;
            foo('D');
        }
    }
    public static void main1(String[] args) {

        int a =100,b=50,c=a---b,d=a---b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

package code728;

public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        StringBuilder stringBuilder=new StringBuilder();
        stringBuffer.append("abcdef");
        stringBuilder.append("abcdef");
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}

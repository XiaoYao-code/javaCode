package code506;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class TestDemo {
    public static void main(String[] args) {
        //定义方法
        String str="zifuchuan";
        String str1=new String("zifuchuan");
        char []array={'z','f','c'};
        String str2=new String(array);
        System.out.println(str==str1);//返回值为false
        System.out.println(str.equals(str1));//返回值为true
        //str和str1都是对象的引用，那么则判断的是两个引用指向的地址是否相同，原因是当直接赋值时，str存在于jvm的运行时常量池中，
        //即使字符串常量池（但是jvm并没有明确规定），new的对象存在于堆上。
        String str11="zifuchuan";
        String str22="zifuchuan";
        String str33="zifuchuan";
        System.out.println(str11==str22);
        System.out.println(str33==str22);
        System.out.println(str11==str33);//三个表达式结果都为true
        //字符串常量池：如果下次继续使用直接赋值的模式声明String类对象，此时对象池之中如若有指定内容，将直接进行引用
        //如若没有，则开辟新的字符串对象而后将其保存在对象池之中以供下次使用
        String str44=new String("zifuchuan").intern();  //intern方法把String手动加入到字符串常量池中
        System.out.println(str11==str44);
        //面试题：请解释String类中两种对象实例化的区别
        //1. 直接赋值：只会开辟一块堆内存空间，并且该字符串对象可以自动保存在对象池中以供下次使用。
        //2. 构造方法：会开堆上的内存空间，不会自动保存在对象池中，可以使用intern()方法手工入池。
        //***************************************************************
        //    String的底层方法节选  privat final修饰的字符数组value  标志着不可从外部修改
        //    implements java.io.Serializable, Comparable<String>, CharSequence {
        //    /** The value is used for character storage. */
        //    private final char value[];
        //
        //    /** Cache the hash code for the string */
        //    private int hash; // Default to 0
        //
        //    /** use serialVersionUID from JDK 1.0.2 for interoperability */
        //    private static final long serialVersionUID = -6849794470754667710L;
        System.out.println(str11.charAt(2));  //拿到一个字符数组的第index下标元素。
        char[]arr1=str11.toCharArray();//把字符串变为字符数组
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print(arr1[i]+" ");
        }
            System.out.println(new String(arr1));  //把字符数组转变为字符串
            System.out.println(new String(arr1,1,3));  //把字符数组转变为字符串
            //offset  偏移量  即前面n个不算   count  长度  即转化长度为m个字符数组
        // String 转 byte[]
        byte[] data = str11.getBytes() ;    //就是转化为对应的ASCii值
        for (int j = 0; j < data.length; j++) {
            System.out.print(data[j]+" ");
        }
        String str55="Zifuchuan";
        System.out.println(str11.equals(str55));   //比较两个字符串是否相等  区分大小写
        System.out.println(str11.equalsIgnoreCase(str55));//比较两个字符串是否相等  不区分大小写
        boolean flg=str11.contains("zifu");//查找一个字符串的子串是否存在
        int s=str11.indexOf("sh");//查找一个字符串中子串是否存在，存在返回首字符串下标，不存在返回-1
        System.out.println(s);
        String str66 = "hello world hello bit" ;
        String[] result = str66.split(" ",2) ;//将字符串安装给给定的间隔regex拆分，拆分下来的子串最多为limit个
        for(String p: result) {
            System.out.println(p);
        }

        //输出结果
        // hello
        //world hello bit
        String str77 = "name=zhangsan&age=18" ;
        String[] result1 = str77.split("&") ;
        System.out.println(Arrays.toString(result1));
        for (int i = 0; i < result1.length; i++) {
            String[] temp = result1[i].split("=") ;
            System.out.println(temp[0]+" = "+temp[1]);
        }
    }

    }
    //public  static boolean func(String str){
    /*  char []arr=str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]-'9'>0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       String str1="123456";
       boolean flg=func(str1);
        System.out.println(flg);*/
       /*char[]val={'a'};
        System.out.println(str1);
        System.out.println(Arrays.toString(val));
        func(str1,val);
        System.out.println(str1);
        System.out.println(Arrays.toString(val));*/



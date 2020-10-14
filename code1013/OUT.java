package code1013;
 abstract class CHOUXIANGLEI{
    private String name;
    public String getName(){
        return  name;
    }
    public  void setName(String  name){
        this.name=name;
    }
    public  abstract  int chouxiangfangfa();
}
public class OUT {
  public void  test(CHOUXIANGLEI 抽象类实例){
      System.out.println(抽象类实例.getName()+"    "+抽象类实例.chouxiangfangfa());
  }

    public static void main(String[] args) {
        OUT out=new OUT();
        out.test(new CHOUXIANGLEI() {
            @Override
            //必须要重写抽象方法
            public int chouxiangfangfa() {
                return 0;
            }
        });
    }
}
/*public class OUT {
    private static String className = "我是类的静态成员属性";
    private String className2 = "我是类的普通的成员属性";
    public void jubu(int c) {
        int  a =1;
         final  int  b=1;
        class InClass {
            public InClass() {
                System.out.println("我是局部内部类的构造方法");
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            }
            void getClassname() {

                System.out.println("我是局部内部类inclass的方法");
            }
        }
    }
    public static void main (String[] args){

    }
}*/
/*public class OUT {

    private static String className="我是类的静态成员属性";
    private  String className2="我是类的普通的成员属性";
    public  class InClass{
        static   int a=1;
        final   static   int a1=1;
        public InClass() {
            System.out.println("我是静态内部类的构造方法");
        }

        void getClassname(){
            System.out.println("我是成员内部类inclass的方法");
            System.out.println(className+"我可以访问外部类的静态成员属性");
            System.out.println(className2+"我可以访问外部类的普通成员属性");
        }
    }

    public static void main(String[] args) {
        OUT.InClass  inClass =new OUT().new InClass();
        inClass.getClassname();


    }
}*/
/*
public class OUT {

    private static String className="我是类的静态成员属性";
    public static class InClass{

        public InClass() {
            System.out.println("我是静态内部类的构造方法");
        }

        void getClassname(){
            System.out.println("我是静态内部类inclass的方法");
            System.out.println(className+"我可以访问外部类的成员属性");
        }
    }

    public static void main(String[] args) {
        OUT.InClass shili=new OUT.InClass();
        shili.getClassname();


    }
}*/

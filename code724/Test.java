package code724;
class B {
    public B() {
        func();
    }

    public void func() {
        System.out.println("B");
    }
}
class  C extends B{
    private   int num=1;

    @Override
    public void func() {
        System.out.println("C"+num);
    }
}
    public class Test {
        public static void main(String[] args) {
             C c=new C();
        }
    }


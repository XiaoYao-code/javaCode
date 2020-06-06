package code606;
class B{
    public B(String B) {
        System.out.println("B");
    }
}

public class TestDemo extends B {
    public TestDemo(String S) {
        System.out.println("D");
    }

    public static void main(String[] args) {
        new TestDemo("C");
    }
}

package code619;

import javax.swing.plaf.nimbus.State;

public class AllThreadState {
    public static void main(String[] args) {
        Thread.State[] values =Thread.State.values();//枚举所有的线程状态
        for (Thread.State s: values) {//打印
            System.out.println(s);
        }
    }
}

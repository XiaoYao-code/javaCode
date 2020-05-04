package code504;


/*class X{
    Y y=new Y();
    public X(){
        System.out.print("X");
    }
}
class Y{
    public Y(){
        System.out.print("Y");
    }
}
class Z extends X{
    Y y=new Y();
    public Z(){
        System.out.print("Z");
    }

}*/




/*

class Base {

    Base() {

        System.out.print("Base");

    }

}
*/

/*public class TestDemo extends Base {

    public static void main( String[] args ) {

        new TestDemo();

        //调用父类无参的构造方法

        new Base();

    }

}*/

/*public class TestDemo{
   *//* public static void main(String[] args) {
        B a = new B();
        B b = new D();
        a.Func();
        b.Func();*//*
    }
}*/


import sun.util.resources.LocaleData;

import java.time.*;

import java.util.Locale;

/*class B {
    public int Func() {
        System.out.print("B");
        return 0;
    }
}
class D extends B {
    @Override
    public int Func() {
        System.out.print("D");
        return 0;
    }
}
    public class TestDemo{
        public static void main(String[] args) {
            B a = new B();
            B b = new D();
            a.Func();
            b.Func();
        }
        }

 */
public class TestDemo{
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        int today=date.getDayOfMonth();
        int month=date.getMonthValue();
        date=date.minusDays(today-1);
        DayOfWeek weekday=date.getDayOfWeek();
        int value=weekday.getValue();
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for (int i = 1; i <value ; i++) {
            System.out.print("    ");
        }
        while (date.getMonthValue()==month){
            System.out.printf("%3d",date.getDayOfMonth());
            if (date.getDayOfMonth()==today){
                System.out.print("*");
            }else {
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if (date.getDayOfWeek().getValue()==1){
                System.out.println();
            }
        }
        if (date.getDayOfWeek().getValue()!=1){
            System.out.println();
        }
    }
}







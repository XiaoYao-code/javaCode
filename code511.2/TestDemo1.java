package code511;
/* class Student{
   public Student(double number, String name, String cla) {
        this.number = number;
        this.name = name;
        this.cla = cla;
    }
    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", cla='" + cla + '\'' +
                '}';
    }
    private double number;
    public  String name;
    public  String cla;

}
public class List {
    public static void main(String[] args) {
        Student student1=new Student(85,"小明","bit");
        Student student2=new Student(75,"小红","bit");
        Student student3=new Student(95,"老王","bit");
        Student[]list=new Student[]{student1,student2,student3};
        for (int i = 0; i <list.length ; i++) {
            System.out.println(list[i]);
        }
    }*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TestDemo1 {
    public static void main(String[] args) {
        String s1="yao xin yuan";
        String s2="yuan";
        List<Character>list=new ArrayList<>();
        list=func(s1,s2);
        for (Character s:list) {
            System.out.print(s);
        }
        }
    public static List<Character> func(String str1,String str2){
        List<Character>list=new ArrayList<>();
        for (int i = 0; i <str1.length(); i++) {
            if (!str2.contains(str1.charAt(i) + "")) {
                list.add(str1.charAt(i));
            }
        }
        return list;
    }
}

package code513;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public boolean canThreePartsEqualSum(int[] A) {
           int sum = 0;
        for (int i = 0; i <A.length ; i++) {
            sum+=A[i];
        }
        if (sum%3!=0){
            return  false;
        }
        int sum1=0;
        int s=0;
        for (int j = 0; j <A.length ; j++) {
            sum1+=A[j];
            if (sum1==sum/3){
                s++;
                sum1=0;
            }
        }
        if (s>=3){
            return true;
        }
        return false;

    }
    public static void func(String str1,String str2){
        List<Character>list= new ArrayList<>();
        for (int i = 0; i <str1.length() ; i++) {
            if (!str2.contains(str1.charAt(i)+"")){
                list.add(str1.charAt(i));
            }
        }
        for (Character a:
            list ) {
            System.out.print(a);
        }

    }
  public static int  func(List<Object> s){
        return -1;

  }
    public static void main(String[] args) {



    }

}

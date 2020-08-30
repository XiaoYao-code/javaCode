package code502;

import java.util.Arrays;
//import java.lang.Math;
public class OJ {
        public  static  int[] printNumbers(int n) {
            int [] arr=new int[(int)Math.pow(10,n)-1];
            for (int i = 1;i <(int)Math.pow(10,n) ; i++) {
                arr[i-1]=i;
            }
            return arr;
        }

    public static void main(String[] args) {
        int x=1;
        int []arr=printNumbers(x);
        System.out.println(Arrays.toString(arr));
    }
}

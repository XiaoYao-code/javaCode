package code603;

import java.util.Arrays;

public class Sort {
    //插入排序
    public  static void insertSort(int []arr){
        for (int i = 1; i <arr.length ; i++) {
            //有序空间的范围[0,i)
            //无序空间的范围[i,aar.length-1]
            int tmp=arr[i];//无序空间的第一个数
            int j = i-1;
            for (; j >=0&&arr[j]>tmp ; j--) {
                arr[j+1]=arr[j];

            }
            arr[j+1]=tmp;
        }
    }

    public static void main(String[] args) {
        int[]arr={5,6,6,8,7,1,3,9,5};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

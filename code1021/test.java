package code1021;

public class test {
    //冒泡排序升序
    //思想：用第一个元素和后面所有的元素比较，如果当前元素大，则交换。
    //把大的元素沉到最下边，小元素放在最上边。
    // 一直遍历到数组的最后一个元素。再遍历下一个元素
    //性质：始终是O（n2）
    public static int[]  maopao (int []arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
              if (arr[i]>arr[j]){
                  int temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
              }
            }
        }
        return arr;
    }
    public static int[]  kuaipai(int []arr){
        return arr;
    }
    //插入排序1.直接插入排序
    //思想：接牌思想，第一个数据默认有序，从第二个数据开始遍历。每次把插入的值放入到tmp中，从它的前一个下标开始比，
    // 如果小于前一个值那么，把前一个值放在当前位置。然后j--，再比较再前一个位置，如果tmp的值还是小，那么重复，直到
    //tmp遇到一个比它小的值，因为此时j已经--了，所以要放在j+1位置处。
    //性质：  最坏的情况降序是O (n2)，如果是最好的情况已经有序，则是O（n）  空间复杂度是O(1)申请了tmp   稳定的
    //ps：越有序越快
    //如果一个排序是稳定的可以通过代码来实现让它不稳定，但是如果是不稳定的是不可能把它变成稳定的
    //如果是一个稳定的排序，那么它就没有跳跃式的交换。
    public static int[]  insertSort(int []arr){
        int tmp=0;
        for (int i = 1; i <arr.length ; i++) {
            tmp=arr[i];
            int j=i-1;
            while (j>-1){
                if (arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {

                    break;//如果tmp 的值已经比前一个大了，说明tmp已经找到了位置，并且可以保证该位置前面的元素都比他小，
                    //直接跳出循环即可
                }
              j--;
            }
            arr[j+1]=tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr=new int[]{1,3,5,6,7,9,4,8,2,10};
        //maopao(arr);
        //insertSort(arr);
        for (int i = 0; i <10 ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

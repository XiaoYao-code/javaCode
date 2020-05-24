package code524;



import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class TestDemo {
    public static void insertSort(int[] arr){//插入排序
        /**
         * 插入排序：
         * 时间复杂度： 最坏情况   O（n^2）,最优情况 O（n）  即是已经有序，只进行第一层for循环。
         * “越有序越快”
         * 空间复杂度：只申请一个额外空间O（1）
         * 稳定性：稳定
         * “如果一个排序是稳定的排序，那么它有可能变为不稳定排序。如果是一个本来就不稳定的排序，无论如何都不能变为稳定的排序”
         * ps:稳定的排序没有跳跃性的交换，反之同理
         */
        int j=0;
        for (int i = 1; i <arr.length ; i++) {//每次插入进来的元素放入tmp中，先和前一个元素比较，
            // 如果大于那么放入队尾，如果小于那么两者交换继续比较
            int tmp=arr[i];//每次拿到一个元素，不计算arr[0]  因为只有一个元素时本身就是有序的，相当于揭牌
            for ( j = i-1; j >=0 ; j--) {
                if (arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }//每次j的循环完毕说明，tmp中已经保存当前队列的最大数值，走吧tmp放入队尾即可。
            }
            arr[j+1]=tmp;
        }

    }
    public static void shell(int[]arr,int gap) {
        int j=0;
        for (int i = gap; i <arr.length ; i++) {//起步位置变了

            int tmp=arr[i];
            for ( j = i-gap; j >=0 ; j-=gap) {//j每次跨越gap个单位，j还是保持是i的后驱，
                 // 和插入排序没有什么区别，只是先进行了分组，把子数列先进行排序，最后还是进行的是gap为1插入排序，只不过在排序之前已经趋于有序，
                // 印证了插入排序越有序越快的特点。
                if (arr[j]>tmp){
                    arr[j+1]=arr[j];
                }else {
                    break;
                }
            }

        }
    }

    public static void shellSort(int[]arr){//希尔排序（缩小增量排序）
        /**
         * 希尔排序:希尔排序是在插入排序的基础上，应用了分组思想，且分组必须为素数，最后一组必须为1.例如{5，3，1}
         * 时间复杂度：最好O(N),最坏O(N^2),平均O(N^1.3)
         * 空间复杂度：O（1）
         * 稳定性:不稳定的
         */
        int []array={5,3,1};
        for (int i = 0; i <array.length; i++) {
           shell(arr,array[i]);
        }

    }

    public static void main(String[] args) {
        int []arr=new int[10_000];
        Random random=new Random(10_000);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=random.nextInt(10_000);
        }
        long star=System.currentTimeMillis();//求时间复杂度
          insertSort(arr);
        long end=System.currentTimeMillis();
        System.out.println(end-star);//
        System.out.println(Arrays.toString(arr));//打印数据太多时会跑死
    }
    public static void main1(String[] args) {
        int[] arr={10,5,30,2,1,50,36};
        System.out.println(Arrays.toString(arr));
        insertSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void three_num_mid(int[] array,int left,int right) {
        int mid=(left+right)/2;
        int a=Math.max(Math.max(array[mid],array[left]),array[right]);
        int b=Math.min(Math.min(array[mid],array[left]),array[right]);
        array[mid]=array[right]+array[left]+array[mid]-a-b;
        array[left]=b;
        array[right]=a;
    }

    public static int partition(int[] array,int low,int high) {

        int tmp = array[low];
        while (low < high) {
            while (array[low]<=tmp) {
                low++;
            }

            while (array[high]>tmp) {
                high--;
            }
            int tmp1=array[low];
            array[low]=array[high];
            array[high]=tmp1;
        }
        return low;
    }

    public static void quick(int[] array,int left,int right) {
        if(left >= right) {
            return;
        }
        int par=partition(array,left,right);
        quick(array,left,par-1);
        quick(array,par+1,right);

    }

}







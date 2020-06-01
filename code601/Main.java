package code601;
import java.util.Scanner;
public class Main {
 public static  int back(String A,String B){
        int num=0;
        for (int i = 0; i <=A.length() ; i++) {
            StringBuilder stringBuilder=new StringBuilder();
            stringBuilder.append(A);
            stringBuilder.insert(i,B);
            if (judge(stringBuilder.toString())){
             num++;
            }
        }
        return num;
}
public static boolean judge(String s){
        int i=0;
        int j=s.length()-1;
        while (j>=i){
            if (s.charAt(i)!=s.charAt(j)){
              return false;
            }
            i++;
            j--;
        }
        return true;
}
    public static void main1(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        int sum=back(A,B);
        System.out.println(sum);
    }
/*public static boolean isHuiWen(String s){
    int i=0;
    int j=s.length()-1;
    while(i<j){
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        i++;
        j--;
    }
    return true;
}
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        int count=0;
        for(int i=0;i<=str1.length();i++){
            StringBuilder sb=new StringBuilder(str1);
            sb.insert(i,str2);//从0号位置开始插入
            if(isHuiWen(sb.toString())){
                //说明是回文，计数+1
                count++;
            }
        }
        System.out.println(count);
    }*/
public static int findKth(int[] a, int n, int K) {
    quickSort(a);
    return a[n-K];
}
public static void quickSort(int[] arr) {
    if (arr == null || arr.length <= 1) return;
    quickSort(arr, 0, arr.length);
}
    private static void quickSort(int[] arr, int low, int high) {
        if (high - low <= 1)
            return;
        int partition = partition(arr, low, high);
        quickSort(arr, low, partition);
        quickSort(arr, partition + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high - 1;
        while (left < right) {
            while (left < right && arr[right] >= pivot) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= pivot) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int []arr={5,3,2,1,4};
        System.out.println(findKth(arr, 5, 1));

    }


}

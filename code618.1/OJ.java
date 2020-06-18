package code618;
import java.util.Scanner;
public class OJ {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0; i < n; i++){
                    a[i]= sc.nextInt();
                }
                int count = 0;
                int grade = sc.nextInt();
                for(int i = 0; i < n; i++){
                    if(a[i] == grade){
                        count++;
                    }
                }
                System.out.println(count);
            }



    public static void main1(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int m=sc.nextInt();
            while (m>0){
                int n=sc.nextInt();
                int k=sc.nextInt();
                int[]arr=new int[2*n];
                for (int i = 0; i <2*n ; i++) {
                    int tmp=i;
                    for (int j = 0; j <k ; j++) {
                        if (tmp<n){
                            tmp=tmp*2;
                        }else {
                            tmp=(tmp-n)*2+1;
                        }
                    }
                    arr[tmp]=sc.nextInt();
                }
                for (int i = 0; i <2*n ; i++) {
                    if (i==2*n-1){
                        System.out.print(arr[i]);
                    }else {
                        System.out.print(arr[i]+" ");
                    }
                }
                System.out.println();
                m--;
            }


        }
    }
}

package yaoxinyuan.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class OJ {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String ressult = "";
        int count = 0;
        char [] arr = string.toCharArray();
        for (int i= 0 ;i<arr.length;i++){
            if('0'<=arr[i] && '9'>= arr[i]){//当前的是数字
                count = 1;//初始化计算器
                int index = i;//在后面的循环存储截至索引
                for(int j=i+1;j<arr.length;j++){
                    if('0'<=arr[j] && '9'>= arr[j]){
                        count++;
                        index =j;
                    }else {
                        break;
                    }
                }
                if(count>ressult.length()){
                    ressult = string.substring(i,index+1);
                }
            }

        }
        System.out.println(ressult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        int right = 0;
        int left = 0;
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                flag = 1;
                left = i;
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(j) >= '0' && str.charAt(j) <= '9') {
                        flag++;
                        right = j;
                    } else {
                        break;
                    }
                }
                if (flag > str1.length()) {
                    str1 = str.substring(left, right + 1);

                }
            }
        }
        System.out.println(str1);


    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (input==null||input.length==0||k>input.length) {
            return arrayList;
        }
        Arrays.sort(input);
        for (int i = 0; i <k ; i++) {
            arrayList.add(input[i]);
        }
        return arrayList;
    }
}

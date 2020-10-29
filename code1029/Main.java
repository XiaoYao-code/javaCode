package code1029;

import java.util.Arrays;

//旋转数组的最小数字
/*把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
        输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
        NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。*/

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 1, 2};

        System.out.println(minNumberInRotateArray1(arr));
    }

    public int minNumberInRotateArray(int[] array) {
        //直接排序
        if (array.length == 0) return 0;
        Arrays.sort(array);
        return array[0];
    }

    public static int minNumberInRotateArray1(int[] array) {
        if (array.length == 0) return 0;
             //二分法 没有target 因为是非递减数组的旋转数组，那么构造一定是类似与{3, 4, 5, 1, 2};或者{1，0，1，1，1}
        //则一定要比较的是mid在那个区间，就是找到旋转的边界
        int right = array.length - 1;
        int left = 0;
        int mid = 0;
        while (right > left) {
            if (array[left]<array[right]){
                return array[left];
            }

            mid=(left+right)/2;
            if (array[mid] < array[right]) {
                right = mid;
            } else if (array[mid] > array[left]) {
                left = mid + 1;
            } else {
                left++;
            }


        }
        return array[left];
    }
}

package code522;

public class TestDemo {
    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp=array[i];
            int j;
            for (j=i-gap;j>=0;j-=gap){
                if (tmp<array[j]){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    public static  void  shellSort(int[] array) {

        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }
    public static void selectSort(int[] array) {

    }



}

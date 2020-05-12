package code512;


import java.util.ArrayList;
import java.util.List;
  class A<T> {
    T value;

    A(T value) {
        this.value=value;
    }

    T get() {
        return value;
    }
}
public class Main {
    public static void main(String[] args) {
        A a=new A(100);
        A b=new A("123456");
        System.out.println(a.get());
        System.out.println(b.get());
    }
    //力扣997
    public int findJudge(int N, int[][] trust) {//笨办法
        if (N == 1)
            return 1;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < trust.length; i++) {
            list.add(trust[i][0]);//把信赖别人得人放在一个数组
        }
        for (int i = 0; i < trust.length; i++) {
            if (!list.contains(trust[i][1])) {  //寻找被人信赖且不存在信赖别人得人得可能
                int count = 0;
                for (int j = 0; j < trust.length; j++) {  //满足信赖人数为N-1的人就是法官
                    if (trust[j][1] == trust[i][1]) {
                        count++;
                    }
                }
                if (count == N - 1) {
                    return trust[i][1];
                }
            }
        }
        return -1;
    }
    public int findJudge1(int N, int[][] trust) {//出入度
        int[]indegree=new int[N+1];
        int[]outdegree=new int[N+1];
        for (int[] a:trust ) {
            int start=a[0];
            int end=a[1];
            indegree[end]++;
            outdegree[start]++;
        }
        for (int i = 1; i <N ; i++) {
            if (indegree[i]==N-1&&outdegree[i]==0)
                return i;
        }
        return -1;

    }
    public boolean canThreePartsEqualSum(int[] A) {
         return true;
    }
}
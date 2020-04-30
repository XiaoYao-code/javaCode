package code430;


public class Oj {
    //「快乐数」定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是 无限循环 但始终变不到 1。如果 可以变为  1，那么这个数就是快乐数。
    //
    //如果 n 是快乐数就返回 True ；不是，则返回 False 。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/happy-number
public boolean ishappy(int n){//暴力解题   实际不对
    for (int i = 0; i <100 ; i++) {
        int ret=0;
        while (n>0){
            ret+=(n%10)*(n%10);
            n/=10;
        }
        if (ret==1){
            return true;
        }
        n=ret;
    }
    return false;
}
}

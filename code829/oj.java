package code829;

import java.util.Stack;

public class oj {
    static int calSquareNum(double x, double y, double r) {
        int[] pointX = new int[]{0, 30, 60, 90};
        int[] pointY = new int[]{0, 30, 60, 90};
        int ans = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                demo:
                for(int X = pointX[i]; X <= pointX[i + 1]; X++){
                    for(int Y = pointY[j]; Y <= pointY[j + 1]; Y++){
                        if(Math.sqrt((Math.pow(X - x, 2)) + Math.pow(Y - y, 2)) < r){
                            ans++;
                            break demo;
                        }
                    }
                }
            }
        }
        return ans;
    }
    static boolean isValidPop(int[] push, int[] pop) {
        
        Stack<Integer> left = new Stack<>();
        boolean flag = true;
        int index = 0;
        for(int i = 0; i < pop.length; i++){
            if(!left.isEmpty() && left.peek() == pop[i]){
                left.pop();
                continue;
            }
            if(index < push.length && push[index] == pop[i]){
                index++;
                continue;
            }
            boolean fflag = true;
            while(index < push.length){
                if(pop[i] == push[index]){
                    index++;
                    fflag = false;
                    break;
                } else {
                    left.add(push[index++]);
                }
            }
            if(fflag){
                flag = false;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {

    }
}

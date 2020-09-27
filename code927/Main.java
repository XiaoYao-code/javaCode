package code927;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[][] mat = new int[110][110];
        int[][] Go1 = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        int[][] Go2 = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while((t--) != 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    mat[i][j] = -1;
                }
            }
            boolean flag = true;
            int val = 1;
            for(int i = 0; i < (int) Math.ceil(n / 2.0); i++){
                int len = n - i * 2;
                int x = i, y = i;
                mat[x][y] = val++;
                for(int j = 0; j < 4; j++){
                    for(int k = 0; k < len - 1; k++){
                        if(flag){
                            x += Go1[j][0];
                            y += Go1[j][1];
                            if(mat[x][y] == -1)
                                mat[x][y] =val++;
                        } else {
                            x += Go2[j][0];
                            y += Go2[j][1];
                            if(mat[x][y] == -1)
                                mat[x][y] =val++;
                        }
                    }
                }
                flag = !flag;
            }
/*            for(int i = 0; i < n; i++){
                for(int j = 0; j < n; j++){
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }*/
            for(int i = 0; i < m; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                System.out.println(mat[x][y]);
            }
        }
    }
}

package 剑指offer.P29_顺时针打印矩阵;


import java.util.Arrays;

class Solution {
    private int x;
    private int y;
    private boolean[][] visited;
    private int m;
    private int n;
    private int moveOrientation;

    private boolean checkValid(int x, int y){
        return x >= 0 && y >= 0 && x < m && y < n && !visited[x][y];
    }


    private void move(){
        if (moveOrientation%4 == 0){
            if (checkValid(x, y+1)){
                y += 1;
            }else{
                moveOrientation++;
            }
        }else if (moveOrientation%4 == 1){
            if (checkValid(x+1, y)){
                x += 1;
            }else{
                moveOrientation++;
            }
        }else if (moveOrientation%4==2){
            if (checkValid(x, y-1)){
                y -= 1;
            }else{
                moveOrientation++;
            }
        }else{
            if (checkValid(x-1, y)){
                x -= 1;
            }else{
                moveOrientation++;
            }
        }
    }


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        // m行n列
        m = matrix.length;
        n = matrix[0].length;
        int[] ans = new int[m*n];
        visited = new boolean[m][n];

        // 4个移动方向，0, 1, 2, 3
        moveOrientation = 0;
        int idx = 1;
        x = 0;
        y = 0;

        ans[0] = matrix[0][0];
        visited[0][0] = true;

        while (idx < m*n){
            int temp = moveOrientation;
            move();
            if (temp == moveOrientation){
                ans[idx] = matrix[x][y];
                visited[x][y] = true;
                idx++;
            }
        }

        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(s.spiralOrder(mat)));
    }
}

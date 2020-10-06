package 剑指offer.P29_顺时针打印矩阵;


class Solution {
    private int[] move(int x, int y, int ori){
        int[] xy = new int[2];
        if (ori%4 == 0){
            y += 1;
        }else if (ori%4 == 1){
            x += 1;
        }else if (ori%4==2){
            y -= 1;
        }else{
            x -= 1;
        }
        xy[0] = x;
        xy[1] = y;
        return xy;
    }


    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return new int[0];
        }
        // m行n列
        int m = matrix.length;
        int n = matrix[0].length;
        int[] ans = new int[m*n];
        boolean[][] visited = new boolean[m][n];

        // 4个移动方向，0, 1, 2, 3
        int moveOrientation = 0;
        int idx = 1;
        int x = 0;
        int y = 0;

        ans[0] = matrix[0][0];
        visited[0][0] = true;

        while (idx < m*n){

            int[] newXY = move(x, y, moveOrientation);
            int newX = newXY[0];
            int newY = newXY[1];
            if ((newX < 0 || newY < 0 || newX >= m || newY >= n) || (visited[newX][newY])){
                moveOrientation++;
                newX = x;
                newY = y;
            }else{
                ans[idx] = matrix[newX][newY];
                visited[newX][newY] = true;
                idx++;
            }

            x = newX;
            y = newY;
        }

        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

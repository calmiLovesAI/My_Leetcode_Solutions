package from_1_to_200.P59_螺旋矩阵II;

import java.util.Arrays;

class Solution {
    public int[][] generateMatrix(int n) {
        int num = 1;
        int[][] matrix = new int[n][n];
        int left = 0, top = 0, right = n - 1, bottom = n - 1;
        while (left <= right && top <= bottom){
            // 向右遍历
            for (int j = left; j <= right; j++){
                matrix[top][j] = num;
                num++;
            }
            // 向下遍历
            for (int i = top+1; i <= bottom; i++) {
                matrix[i][right] = num;
                num++;
            }
            if (left < right && top < bottom){
                // 向左遍历
                for (int j = right-1; j > left; j--) {
                    matrix[bottom][j] = num;
                    num++;
                }
                // 向上遍历
                for (int i = bottom; i > top; i--){
                    matrix[i][left] = num;
                    num++;
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return matrix;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().generateMatrix(3)));
    }
}

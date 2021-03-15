package from_1_to_200.P54_螺旋矩阵;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return ans;
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0, top = 0, right = cols - 1, bottom = rows - 1;
        while (left <= right && top <= bottom){
            // 向右遍历
            for (int j = left; j <= right; j++){
                ans.add(matrix[top][j]);
            }
            // 向下遍历
            for (int i = top+1; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            if (left < right && top < bottom){
                // 向左遍历
                for (int j = right-1; j > left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                // 向上遍历
                for (int i = bottom; i > top; i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
            top++;
            right--;
            bottom--;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

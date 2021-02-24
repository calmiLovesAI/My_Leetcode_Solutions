package from_401_to_600.P566_重塑矩阵;

import java.util.Arrays;

class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length, n = nums[0].length;
        if (m * n != r * c){
            return nums;
        }
        int[][] ans = new int[r][c];
        for (int i = 0; i < r; i++){
            for(int j = 0; j < c;j++){
                int totalIdx = c * i + j;
                ans[i][j] = nums[totalIdx / n][totalIdx % n];
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().matrixReshape(new int[][]{{1, 2, 3, 4}}, 2, 2)));
    }
}

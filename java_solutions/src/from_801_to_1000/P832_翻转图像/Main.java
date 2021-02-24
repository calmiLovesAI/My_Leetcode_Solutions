package from_801_to_1000.P832_翻转图像;

import java.util.Arrays;

class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        // m 行 n 列
        int m = A.length, n = A[0].length;
        for (int i = 0; i < m ; i++){
            int start = 0, end = n - 1;

            while (start < end){
                if (A[i][start] == A[i][end]){
                    A[i][start] = 1 - A[i][start];
                    A[i][end] = 1 - A[i][end];
                }

                start++;
                end--;
            }
            if (start == end){
                A[i][start] = 1 - A[i][start];
            }
        }
        return A;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().flipAndInvertImage(new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}})));
    }
}

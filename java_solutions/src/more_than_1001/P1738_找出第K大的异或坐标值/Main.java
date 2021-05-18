package more_than_1001.P1738_找出第K大的异或坐标值;

/*

设矩阵(i,j)处的值为f(i)(j)，则
f(i)(j) = f(i-1)(j-1) ^ f(i)(j-1) ^ f(i-1)(j) ^ matrix(i)(j)
 */

import java.util.ArrayList;
import java.util.Comparator;

class Solution {
    public int kthLargestValue(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int[][] dp = new int[m+1][n+1];
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = dp[i-1][j-1] ^ dp[i][j-1] ^ dp[i-1][j] ^ matrix[i-1][j-1];
                arrayList.add(dp[i][j]);
            }
        }

        arrayList.sort((o1, o2) -> o2 - o1);

        return arrayList.get(k-1);
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

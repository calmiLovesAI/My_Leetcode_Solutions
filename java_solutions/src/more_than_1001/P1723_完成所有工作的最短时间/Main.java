package more_than_1001.P1723_完成所有工作的最短时间;


//  动态规划 + 状态压缩
/*
f[i][j]表示给前i个人分配工作，工作的分配情况为j时，完成所有工作的最短时间。注意这里的j是一个二进制整数，表示了工作的分配情况。

 */
class Solution {
    public int minimumTimeRequired(int[] jobs, int k) {
        int n = jobs.length;
        int m = 1 << n;    // 有  2^n种情况
        int[] sum = new int[m];
        for (int i = 1; i < m; i++) {
            int x = Integer.numberOfTrailingZeros(i), y = i - (1 << x);
            sum[i] = sum[y] + jobs[x];
        }
        int[][] dp = new int[k][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = sum[i];
        }

        for (int i = 1; i < k; i++) {
            for (int j = 0; j < m; j++) {
                int minn = Integer.MAX_VALUE;
                for (int x = j; x != 0; x = (x - 1) & j) {
                    minn = Math.min(minn, Math.max(dp[i - 1][j - x], sum[x]));
                }
                dp[i][j] = minn;
            }
        }
        return dp[k - 1][m - 1];
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minimumTimeRequired(new int[]{1,2,4,7,8}, 2));
    }
}

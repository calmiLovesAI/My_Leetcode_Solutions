package from_601_to_800.P664_奇怪的打印机;


class Solution {
    public int strangePrinter(String s) {
        // 区间DP
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = n - 1; i >= 0; i--){
            dp[i][i] = 1;
            for (int j = i+1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i][j-1];
                }else{
                    int t = Integer.MAX_VALUE;
                    for (int k = i; k < j; k++) {
                        t = Math.min(t, dp[i][k] + dp[k+1][j]);
                    }
                    dp[i][j] = t;
                }
            }
        }
        return dp[0][n-1];
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

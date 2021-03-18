package from_1_to_200.P115_不同的子序列;

//  动态规划
class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        if (m < n){
            return 0;
        }
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m-1; i >= 0; i--) {
            char c1 = s.charAt(i);
            for (int j = n-1; j >= 0; j--) {
                char c2 = t.charAt(j);
                if (c1 == c2){
                    dp[i][j] = dp[i+1][j] + dp[i+1][j+1];
                }else {
                    dp[i][j] = dp[i+1][j];
                }
            }
        }
        return dp[0][0];
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

package 剑指offer.P10_II_青蛙跳台阶问题;


import java.util.Arrays;

class Solution {
    public int numWays(int n) {
        // 动态规划
        int[] dp = new int[n+1];   // 初始化为0
        if(n==0){
            return 1;
        }else if(n==1){
            return 1;
        }
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= n;i++){
            dp[i] = dp[i-1] + dp[i-2];
            dp[i] = dp[i]%((int)1e9+7);
        }
        return dp[n];
    }
}



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.numWays(7));
    }
}

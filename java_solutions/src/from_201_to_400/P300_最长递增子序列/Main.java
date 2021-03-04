package from_201_to_400.P300_最长递增子序列;

import java.util.Arrays;

// 动态规划
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1){
            return 1;
        }
        // dp[i] 表示  以位置i结尾的最长严格递增子序列的长度
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().lengthOfLIS(new int[]{0,1,0,3,2,3}));
    }
}

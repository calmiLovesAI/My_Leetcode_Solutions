package from_1_to_200.P53_最大子序和;


// 动态规划
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return nums[0];
        }
        int[] dp = new int[n];       // 以位置i为结尾的和最大子序列的和
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            ans = Math.max(dp[i], ans);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

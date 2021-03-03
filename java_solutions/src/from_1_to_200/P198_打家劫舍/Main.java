package from_1_to_200.P198_打家劫舍;

class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0){
            return 0;
        }else if (n == 1){
            return nums[0];
        }else if (n == 2){
            return Math.max(nums[0], nums[1]);
        }
        int ans = 0;
        int[] dp = new int[n+1];
        dp[1] = nums[0];
        dp[2] = Math.max(nums[0], nums[1]);
        for (int i = 3; i <= n; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i-1]);
            ans = Math.max(ans, dp[i]);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().rob(new int[]{2,7,9,3,1}));
    }
}

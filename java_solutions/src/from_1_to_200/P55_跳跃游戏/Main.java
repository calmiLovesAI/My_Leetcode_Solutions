package from_1_to_200.P55_跳跃游戏;

// 二维动态规划
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return true;
        }
        boolean[] dp = new boolean[n];
        dp[0] = true;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && nums[j] >= i-j){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n-1];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().canJump(new int[]{0, 2, 3}));
    }
}

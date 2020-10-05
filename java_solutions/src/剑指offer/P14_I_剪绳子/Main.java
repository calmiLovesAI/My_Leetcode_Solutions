package 剑指offer.P14_I_剪绳子;

// 整数划分问题
// 结论：尽量多的3，最多不超过2个2
class Solution1 {
    public int cuttingRope(int n) {
        if (n <= 3){
            return (n - 1);
        }
        int ans = 1;
        if (n %3==1){
            ans *= 4;
            n -= 4;
        }
        if (n % 3 == 2){
            ans *= 2;
            n -= 2;
        }
        while (n!=0){
            ans *= 3;
            n -= 3;
        }
        return ans;
    }
}


// 动态规划
class Solution2 {
    public int cuttingRope(int n) {
        // dp[i]表示剪长度为i的绳子得到的最大乘积
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            // m段中第一段的长度为k
            for(int k = 1; k <= i;k++){
                dp[i] = Math.max(dp[i],Math.max(dp[i-k]*k, (i-k)*k));
            }
        }
        return dp[n];
    }
}



public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.cuttingRope(10));
    }
}

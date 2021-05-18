package from_801_to_1000.P1827_最少操作使数组递增;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int last = nums[0], cur;
        int ans = 0;
        for (int i = 1; i < n; i++) {
            cur = Math.max(last + 1, nums[i]);
            ans += cur - nums[i];
            last = cur;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

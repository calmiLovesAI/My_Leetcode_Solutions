package from_801_to_1000.P1829_每个查询的最大异或值;


class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int sum = 0;
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum ^= nums[i];
            ans[nums.length-i-1] = sum ^ ((1 << maximumBit)-1);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

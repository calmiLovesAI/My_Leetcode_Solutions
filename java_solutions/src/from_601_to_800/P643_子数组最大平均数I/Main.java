package from_601_to_800.P643_子数组最大平均数I;


class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sumValue = 0;
        for (int i = 0; i < k; i++) {
            sumValue += nums[i];
        }
        int maxValue = sumValue;

        for (int i = 0; i < n-k; i++) {
            sumValue += nums[i+k] - nums[i];
            maxValue = Math.max(sumValue, maxValue);
        }

        return (double)maxValue / (double)k;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findMaxAverage(new int[]{0, 4, 0, 3, 2}, 1));
    }
}

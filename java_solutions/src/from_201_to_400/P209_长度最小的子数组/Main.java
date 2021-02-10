package from_201_to_400.P209_长度最小的子数组;


class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0, right = 0;
        int subArrSum = 0;
        int ans = Integer.MAX_VALUE;
        while (right < n){
            subArrSum += nums[right];
            right++;

            while (subArrSum >= target){
                ans = Math.min(ans, right - left);
                subArrSum -= nums[left];
                left++;
            }
        }
        if (ans == Integer.MAX_VALUE){
            return 0;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }
}

package more_than_1001.P1658_将x减到0的最小操作数;


import java.util.Arrays;

/*  双指针：
求一个子数组，它的元素和是一个定值，求它的最大长度
 */
class Solution {
    public int minOperations(int[] nums, int x) {
        int ans = 0;
        int n = nums.length;
        int totalSum = Arrays.stream(nums).sum();
        if (totalSum < x) {
            return -1;
        }

        int arrSum = 0;
        int left = 0, right = 0;
        while (right < n) {
            arrSum += nums[right];
            right++;
            while (arrSum > (totalSum - x)) {
                arrSum -= nums[left];
                left++;
            }

            if (arrSum == (totalSum - x)) {
                ans = Math.max(ans, right - left);
            }
        }

        return ans == 0 ? -1 : n - ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minOperations(new int[]{5, 6, 7, 8, 9}, 4));
    }
}

package from_1_to_200.P137_只出现一次的数字II;


import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i+=3) {
            if (i+2 >= n || nums[i] != nums[i+2]){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().singleNumber(new int[]{2, 2, 3, 2}));
    }
}

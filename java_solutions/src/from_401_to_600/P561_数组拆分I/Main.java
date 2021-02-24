package from_401_to_600.P561_数组拆分I;


import java.util.Arrays;

class Solution {
    public int arrayPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            ans += nums[i];
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().arrayPairSum(new int[]{6,2,6,5,1,2}));
    }
}

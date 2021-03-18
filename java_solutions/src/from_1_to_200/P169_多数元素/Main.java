package from_1_to_200.P169_多数元素;

import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int cnt = 0;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            cnt++;
            if (i >= 1 && nums[i] != nums[i-1]){
                cnt = 1;
            }
            if (cnt > nums.length / 2){
                ans = nums[i];
                break;
            }
        }
        return ans;
    }
}


// Boyer-Moore 投票算法
class Solution2{
    public int majorityElement(int[] nums){
        int count = 0;
        Integer candidate = null;
        for (int num: nums){
            if (count == 0){
                candidate = num;
            }
            count += (num == candidate)? 1:-1;
        }
        return candidate;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().majorityElement(new int[]{3, 2, 3}));
    }
}

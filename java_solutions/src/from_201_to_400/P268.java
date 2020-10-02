package from_201_to_400;
// 缺失数字

import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] temp = new int[2*n+1];
        for(int i = 0; i < n+1; i++){
            temp[i] = i;
        }

        System.arraycopy(nums, 0, temp, n+1, n);

//        System.out.println(Arrays.toString(temp));
        int ans = 0;
        for(int item: temp){
            ans = ans ^ item;
        }

        return ans;
    }
}


public class P268 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(s.missingNumber(nums));
    }
}


package from_1_to_200.P27_移除元素;


import java.util.Arrays;

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        if (n == 1){
            if (nums[0] == val){
                return 0;
            }else{
                return 1;
            }
        }
        int left = 0, right = n - 1;
        while (left < right){
            while (left <= right && nums[left] != val){
                left++;
            }
            while (left <= right && nums[right] == val){
                right--;
            }
            if (left < right){
                int t = nums[left];
                nums[left] = nums[right];
                nums[right] = t;
            }
        }

        return left;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3,3}, 5));
    }
}

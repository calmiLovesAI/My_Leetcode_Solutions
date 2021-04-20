package from_1_to_200.P27_移除元素;


class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        if (n == 0){
            return 0;
        }
        int left = 0, right = 0;
        while (right < n){
            if (nums[right] != val){
                nums[left] = nums[right];
                left++;
            }
            right++;
        }
        return left;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeElement(new int[]{3,3}, 5));
    }
}

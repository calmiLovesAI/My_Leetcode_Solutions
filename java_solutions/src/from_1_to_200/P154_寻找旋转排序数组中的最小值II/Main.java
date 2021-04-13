package from_1_to_200.P154_寻找旋转排序数组中的最小值II;


class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high){
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]){
                high = pivot;
            }else if (nums[pivot] > nums[high]){
                low = pivot + 1;
            }else {
                high--;
            }
        }
        return nums[low];
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findMin(new int[]{2, 2, 2, 0, 1}));
    }
}

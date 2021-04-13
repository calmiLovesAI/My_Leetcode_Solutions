package from_1_to_200.P153_寻找旋转排序数组中的最小值;



//  二分查找
class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high){
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]){
                high = pivot;
            }else{
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

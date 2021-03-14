package from_1_to_200.P35_搜索插入位置;


// 二分查找
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1;
        int ans = n;         // 初始化为一个不可能取到的值
        while (left <= right){
            int mid = (left + right) / 2;
            if (target <= nums[mid]){
                ans = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().searchInsert(new int[]{1,3,5,6}, 5));
    }
}

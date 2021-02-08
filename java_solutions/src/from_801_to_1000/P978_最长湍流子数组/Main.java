package from_801_to_1000.P978_最长湍流子数组;

/*
如果比较符号在子数组中的每个相邻元素对之间翻转，则该子数组是湍流子数组。
 */


// 双指针
class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int n = arr.length;
        int ans = 1;
        // 定义左右指针
        int left = 0, right = 0;
        while (right < n-1){
            // 左右指针为同一个数
            if (left == right){
                if (arr[right] == arr[right+1]){
                    left++;
                }
                right++;
            }else{
                // 满足湍流数组的两种情况
                if (arr[right - 1] > arr[right] && arr[right] < arr[right+1]){
                    right++;
                }else if (arr[right - 1] < arr[right] && arr[right] > arr[right+1]){
                    right++;
                }else{
                    left = right;
                }
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxTurbulenceSize(new int[]{9, 4, 2, 10, 7, 8, 8, 1, 9}));
    }
}

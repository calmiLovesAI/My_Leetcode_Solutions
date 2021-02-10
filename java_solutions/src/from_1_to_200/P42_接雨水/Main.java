package from_1_to_200.P42_接雨水;

/*
双指针：
时间复杂度：O(N)，空间复杂度：O(1)
 */
class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if (n < 3){
            return 0;
        }
        int left = 0, right = n - 1;
        int ans = 0;
        int left_max = 0, right_max = 0;
        while (left < right){
            // 固定right，移动left
            if (height[left] < height[right]){
                if (height[left] > left_max){
                    left_max = height[left];
                }else{
                    ans += Math.min(left_max, height[right]) - height[left];
                }
                left++;
            }else{
                // 固定left，移动right
                if (height[right] > right_max){
                    right_max = height[right];
                }else {
                    ans += Math.min(height[left], right_max) - height[right];
                }
                right--;
            }
        }
        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().trap(new int[]{4,2,0,3,2,5}));
    }
}

package from_1_to_200.P189_旋转数组;


import java.util.Arrays;

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        while (k > 0){
            // 原地向右移动一个位置
            int temp = nums[n-1];
            System.arraycopy(nums, 0, nums, 1, n - 1);
            nums[0] = temp;
            k--;
        }
    }
}


// 翻转数组
class Solution2{
    public void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n-1);   // 翻转所有元素
        reverse(nums, 0, k-1);   // 翻转 [0, k mod n - 1] 区间的元素
        reverse(nums, k, n-1);   // 翻转 [k mod n, n - 1] 区间的元素
    }



    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2 ,3 , 4, 5, 6, 7};
        new Solution2().rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}

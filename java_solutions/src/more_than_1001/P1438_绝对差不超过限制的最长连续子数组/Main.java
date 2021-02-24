package more_than_1001.P1438_绝对差不超过限制的最长连续子数组;


import java.util.LinkedList;

// 滑动窗口 + 单调队列
class Solution {
    public int longestSubarray(int[] nums, int limit) {
        LinkedList<Integer> queMax = new LinkedList<>();    // 单调递减队列
        LinkedList<Integer> queMin = new LinkedList<>();    // 单调递增队列
        int n = nums.length;
        int left = 0, right = 0;
        int ret = 0;
        while (right < n){
            while (!queMax.isEmpty() && queMax.getLast() < nums[right]){
                queMax.removeLast();
            }
            while (!queMin.isEmpty() && queMin.getLast() > nums[right]){
                queMin.removeLast();
            }

            queMax.addLast(nums[right]);
            queMin.addLast(nums[right]);
            while (!queMax.isEmpty() && !queMin.isEmpty() && queMax.getFirst() - queMin.getFirst() > limit){
                if (nums[left] == queMin.getFirst()){
                    queMin.removeFirst();
                }
                if (nums[left] == queMax.getFirst()){
                    queMax.removeFirst();
                }
                left++;
            }
            right++;
            ret = Math.max(ret, right-left);
        }
        return ret;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().longestSubarray(new int[]{8, 2, 4, 7}, 4));
    }
}

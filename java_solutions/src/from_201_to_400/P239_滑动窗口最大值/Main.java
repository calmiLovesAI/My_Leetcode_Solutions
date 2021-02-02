package from_201_to_400.P239_滑动窗口最大值;

import java.util.Arrays;
import java.util.LinkedList;

// 单调队列
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        // 构造一个双端队列，存储下标
        // 在队列中，这些下标按照从小到大的顺序被存储，并且它们在数组nums中对应的值是严格单调递减的
        LinkedList<Integer> deque = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
        }

        int[] ans = new int[n-k+1];
        ans[0] = nums[deque.peekFirst()];
        for (int i = k; i < n; i++) {
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                deque.removeLast();
            }
            deque.addLast(i);
            // 移除所有不在滑动窗口范围内的队首元素
            while (deque.peekFirst() < i - k + 1){
                deque.removeFirst();
            }
            ans[i-k+1] = nums[deque.peekFirst()];
        }
        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
    }
}

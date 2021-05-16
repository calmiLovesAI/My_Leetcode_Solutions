package more_than_1001.P1856_子数组最小乘积的最大值;


import java.util.Arrays;
import java.util.LinkedList;

/*
   单调栈 + 前缀和

 */
class Solution {
    public int maxSumMinProduct(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        // left 初始化为0   , right  初始化为n
        Arrays.fill(left, 0);
        Arrays.fill(right, n-1);
        LinkedList<Integer> q = new LinkedList<>();     // 单调栈 , 栈里面存的是index
        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && nums[q.getLast()] >= nums[i]){
                right[q.getLast()] = i-1;
                q.removeLast();
            }
            if (!q.isEmpty()){
                left[i] = q.getLast() + 1;
            }
            q.addLast(i);
        }

        int[] prefix = new int[n+1];
        for (int i = 1; i <= n; i++) {
           prefix[i] = prefix[i-1] + nums[i-1];
        }

        double ans = 0;

        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, nums[i] * (prefix[right[i] + 1] - prefix[left[i]]));
        }
        return (int) (ans % (1e9 + 7));
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSumMinProduct(new int[]{1,2,3,2}));
    }
}

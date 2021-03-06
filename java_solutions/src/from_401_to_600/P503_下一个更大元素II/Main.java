package from_401_to_600.P503_下一个更大元素II;


import java.util.Arrays;
import java.util.LinkedList;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // 单调栈
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);
        LinkedList<Integer> stack = new LinkedList<>();
        for (int i = 0; i < 2 * n; i++) {
            while (!stack.isEmpty() && nums[i%n] > nums[stack.getLast()]){
                ans[stack.removeLast()] = nums[i%n];
            }
            stack.addLast(i%n);
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

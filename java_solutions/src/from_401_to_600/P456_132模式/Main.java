package from_401_to_600.P456_132模式;


import java.util.LinkedList;
import java.util.TreeMap;

class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        if (n < 3){
            return false;
        }

        // 左侧最小值
        int leftMin = nums[0];
        // 右侧所有元素
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 2; i < n; i++) {
            treeMap.put(nums[i], treeMap.getOrDefault(nums[i], 0) + 1);
        }
        for (int j = 1; j < n-1; j++) {
            if (leftMin < nums[j]){
                Integer next = treeMap.ceilingKey(leftMin + 1);
                if (next != null && next < nums[j]){
                    return true;
                }
            }
            leftMin = Math.min(leftMin, nums[j]);
            treeMap.put(nums[j+1], treeMap.get(nums[j+1])-1);
            if (treeMap.get(nums[j+1]) == 0){
                treeMap.remove(nums[j+1]);
            }
        }
        return false;
    }
}



// 单调栈
class Solution2 {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];     // 从0~i的最小数
        min[0] = nums[0];
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(min[i-1], nums[i]);
        }
        LinkedList<Integer> stack = new LinkedList<>();
        // 从后往前遍历，stack 中的数字表示的是从位置 i 到 n 中，大于 min[i] 且小于 nums[i] 的数
        for (int i = n-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.getLast() <= min[i]){
                stack.removeLast();
            }
            if (!stack.isEmpty() && stack.getLast() < nums[i]){
                return true;
            }
            stack.addLast(nums[i]);
        }
        return false;
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

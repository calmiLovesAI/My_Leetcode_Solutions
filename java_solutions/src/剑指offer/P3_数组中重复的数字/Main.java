package 剑指offer.P3_数组中重复的数字;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


// 方法一：使用HashMap
class Solution {
    public int findRepeatNumber(int[] nums) {
        int ans = -1;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int item : nums) {
            hashMap.merge(item, 1, Integer::sum);
        }

        // 使用迭代器遍历
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v > 1) {
                ans = k;
                break;
            }
        }
        return ans;
    }
}


// 方法二：使用O(1)的空间复杂度
class Solution2 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] != i) {
                if (nums[nums[i]] == nums[i]) {
                    return nums[i];
                } else {
                    // 交换nums[i] 和 nums[nums[i]]
                    int t = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = t;
                }
            }
        }
        return -1;
    }
}

// 方法二：使用集合
class Solution3 {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int num : nums) {
            // add失败会返回false
            if (!hashSet.add(num)){
                return num;
            }
        }
        return -1;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.findRepeatNumber(new int[]{0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}));
    }
}

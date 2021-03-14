package from_1_to_200.P41_缺失的第一个正数;


import java.util.HashSet;

// 哈希表
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            hashSet.add(nums[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!hashSet.contains(i)){
                return i;
            }
        }
        return n + 1;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

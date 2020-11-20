package from_1_to_200.P1_两数之和;


import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])){
                return new int[]{hashMap.get(nums[i]), i};
            }else{
                hashMap.put(target-nums[i], i);
            }
        }
        return new int[2];
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

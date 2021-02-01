package from_801_to_1000.P888_公平的糖果棒交换;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.fairCandySwap(new int[]{1, 1}, new int[]{2, 2})));
    }
}


class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int[] ans = new int[2];
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();

        int avgSum = (sumA + sumB) / 2;

        int deltaA = avgSum - sumA;

        // 在A数组里面寻找一个元素，它加上deltaA之后是B中的一个元素
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int e: A){
            hashMap.put(e + deltaA, e);
        }
        for (int f: B){
            if (hashMap.containsKey(f)){
                ans[0] = hashMap.get(f);
                ans[1] = f;
                break;
            }
        }
        return ans;
    }
}
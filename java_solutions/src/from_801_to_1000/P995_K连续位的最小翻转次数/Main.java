package from_801_to_1000.P995_K连续位的最小翻转次数;

import java.util.LinkedList;

class Solution {
    public int minKBitFlips(int[] A, int K) {
        int ans = 0;
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < A.length; i++) {
            if (!queue.isEmpty() && i > queue.getFirst() + K - 1){
                queue.removeFirst();
            }
            if (queue.size() % 2 == A[i]){
                if (i + K > A.length){
                    return -1;
                }
                queue.addLast(i);
                ans++;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minKBitFlips(new int[]{0, 1, 0}, 1));
    }
}

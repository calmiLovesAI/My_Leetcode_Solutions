package from_401_to_600.P517_超级洗衣机;

import java.util.Arrays;

/*
最少的操作步数为“数组元素的最大值”和“数组元素前缀和的绝对值的最大值”中的较大值。
 */
class Solution {
    public int findMinMoves(int[] machines) {
        int n = machines.length;
        int d = 0;     // 洗衣机中的衣物总数
        for (int e : machines){
            d += e;
        }

        if (d % n != 0){
            return -1;
        }
        int avgD = d / n;

        for (int i = 0; i < n; i++) {
            machines[i] -= avgD;
        }


        int sum = 0;    // 前缀和
        int maxSum = 0;     // 前缀和的绝对值
        int ans = 0;
        int temp = 0;
        for (int e : machines){
            sum += e;
            maxSum = Math.max(Math.abs(sum), maxSum);
            temp = Math.max(e, maxSum);
            ans = Math.max(ans, temp);
        }
        return ans;

    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().findMinMoves(new int[]{1, 0, 5}));
    }
}

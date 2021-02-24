package more_than_1001.P1052_爱生气的书店老板;

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        int total = 0;
        int n = customers.length;
        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                total += customers[i];
            }
        }

        // 滑动窗口
        int increase = 0;
        for (int i = 0; i < X; i++) {
            increase += customers[i] * grumpy[i];
        }

        int t = increase;

        for (int i = X; i < n; i++) {
            increase = increase - customers[i - X] * grumpy[i - X] + customers[i] * grumpy[i];
            t = Math.max(t, increase);
        }

        return total + t;
    }
}


public class Main{
    public static void main(String[] args) {
        System.out.println(new Solution().maxSatisfied(new int[]{1,0,1,2,1,1,7,5}, new int[]{0,1,0,1,0,1,0,1}, 3));
    }
}

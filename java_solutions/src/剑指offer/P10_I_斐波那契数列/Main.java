package 剑指offer.P10_I_斐波那契数列;


class Solution {
    public int fib(int n) {
        int ans = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            ans = (a + b)%((int)1e9+7);
            a = b;
            b = ans;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.fib(45));
    }
}

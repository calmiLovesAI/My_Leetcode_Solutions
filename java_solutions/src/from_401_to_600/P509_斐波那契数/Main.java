package from_401_to_600.P509_斐波那契数;


// 递归
class Solution1 {
    public int fib(int n) {
        if (n == 0 || n == 1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}


// 动态规划
class Solution2{
    public int fib(int n){
        if (n == 0 || n == 1){
            return n;
        }
        int p = 0, q = 1, r = 1;
        for (int i = 2; i <= n; i++) {
            r = p + q;
            p = q;
            q = r;
        }
        return r;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution2().fib(200));
    }
}

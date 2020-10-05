package 剑指offer.P16_数值的整数次方;

class Solution {

    private double quickMul(double x, long n){
        double ans = 1.0;
        while (n > 0){
            if (n%2==1){
                ans *= x;
            }
            x *= x;
            n = n / 2;
        }
        return ans;
    }


    public double myPow(double x, int n) {
        // 快速幂
        long N = n;
        if (N < 0){
            return 1.0 / quickMul(x, Math.abs(N));
        }else{
            return quickMul(x, N);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

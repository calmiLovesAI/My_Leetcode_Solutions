package from_1_to_200.P50_x的n次幂;

import java.lang.Math;

// 快速幂（递归实现）
// 时间复杂度：O(log(n))，空间复杂度O(log(n))
class Solution {
    public double quickMultiply(double x, long n){
        if (n==0){
            return 1;
        }
        double y = quickMultiply(x, n/2);
        if(n%2==0){
            return y * y;
        }else{
            return y * y * x;
        }
    }


    public double myPow(double x, int n) {
        if((long) n < 0){
            return 1.0 / quickMultiply(x, Math.abs((long) n));
        }else{
            return quickMultiply(x, n);
        }
    }
}


// 快速幂（迭代实现）
// 时间复杂度：O(log(n))，空间复杂度：O(1)
class Solution1 {
    public double quickMultiply(double x, long n){
        double ans = 1.0;
        double x_contribute = x;
        while(n>0){
            if (n%2==1){
                ans *= x_contribute;
            }
            x_contribute *= x_contribute;
            n /= 2;
        }
        return ans;
    }

    public double myPow(double x, int n) {
        long N = n;
        if((long) n < 0){
            return 1.0 / quickMultiply(x, Math.abs((long) n));
        }else{
            return quickMultiply(x, n);
        }
    }
}



public class Demo {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.myPow(2.0, -5));
    }
}

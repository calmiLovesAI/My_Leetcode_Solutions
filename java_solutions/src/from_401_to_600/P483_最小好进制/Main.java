package from_401_to_600.P483_最小好进制;

class Solution {
    public String smallestGoodBase(String n) {
        long nVal = Long.parseLong(n);
        // 随着m的增大，k逐渐减小，而k的最小值是2
        int mMax = (int) Math.floor(Math.log(nVal) / Math.log(2));
        for (int m = mMax; m > 1; m--) {
            int k = (int) Math.pow(nVal, 1.0/ m);
            long mul = 1;
            long sum = 1;
            for (int i = 0; i < m; i++) {
                mul *= k;
                sum += mul;
            }
            if (sum == nVal){
                return Integer.toString(k);
            }
        }
        return Long.toString(nVal-1);
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

package from_201_to_400.P202_快乐数;

import java.util.HashSet;

class Solution {

    public int bitSquareSum(int x){
        int ans = 0;
        while (x > 0){
            int n = x % 10;
            ans += (int)Math.pow(n, 2);
            x = x / 10;
        }
        return ans;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (n != 1){
            n = bitSquareSum(n);
            if (!hashSet.add(n)){
                return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

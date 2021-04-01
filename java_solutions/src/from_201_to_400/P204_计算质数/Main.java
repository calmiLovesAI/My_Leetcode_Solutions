package from_201_to_400.P204_计算质数;

import java.util.Arrays;

class Solution {
    public int countPrimes(int n) {
        int[] isPrime = new int[n];   // 1：质数，0：合数
        int ans = 0;
        Arrays.fill(isPrime, 1);
        for (int i = 2; i <= n-1; i++) {
            if (isPrime[i] == 1){
                ans++;
                if ((long)i*i < n){
                    for (int j = i*i; j < n; j+=i) {
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

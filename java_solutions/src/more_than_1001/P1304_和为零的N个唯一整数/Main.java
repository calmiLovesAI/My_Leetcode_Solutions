package more_than_1001.P1304_和为零的N个唯一整数;

import java.util.Arrays;

class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        if (n % 2 == 1){
            n--;
        }
        int idx = 0;
        for (int i = 1; idx < n; i++) {
            ans[idx++] = i;
            ans[idx++] = -i;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().sumZero(7)));
    }
}

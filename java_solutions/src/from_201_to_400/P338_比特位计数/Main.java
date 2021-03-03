package from_201_to_400.P338_比特位计数;

import java.util.Arrays;

class Solution {
    public int[] countBits(int num) {
        int[] ans = new int[num+1];
        for (int i = 1; i <= num; i++) {
            ans[i] = ans[i&(i-1)] + 1;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().countBits(7)));
    }
}

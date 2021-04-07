package LCP.P2_分式化简;


import java.util.Arrays;

class Solution {
    public int[] fraction(int[] cont) {
        if (cont.length == 1) {
            return new int[]{cont[0], 1};
        }
        int n = cont[cont.length - 1];
        int m = 1;
        for (int i = cont.length - 2; i >= 0; --i) {
            int tmp = n;
            n = cont[i] * n + m;
            m = tmp;
        }
        return new int[]{n, m};
    }
}




public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().fraction(new int[]{3, 2, 0, 2})));
    }
}

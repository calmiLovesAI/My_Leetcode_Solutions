package more_than_1001.P1734_解码异或后的排列;


class Solution {
    public int[] decode(int[] encoded) {
        int n = encoded.length + 1;
        // 原数组种所有元素的异或值
        int a = 0;
        for (int i = 1; i <= n; i++) {
            a ^= i;
        }
        // 原数组中除了第一个元素之外所有元素的异或 == encoded数组中下表为奇数的元素异或
        int b = 0;
        for (int i = 1; i < n-1; i+=2) {
            b ^= encoded[i];
        }
        int[] ans = new int[n];
        ans[0] = a ^ b;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i-1] ^ encoded[i-1];
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

package 剑指offer.P15_二进制中1的个数;

class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        String binaryNumber = Integer.toBinaryString(n);
        for (int i = 0; i < binaryNumber.length(); i++) {
            if (binaryNumber.charAt(i) == '1') {
                ans++;
            }
        }
        return ans;
    }
}

// 位运算
class Solution2 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = (n - 1) & n;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hammingWeight(9));
    }
}

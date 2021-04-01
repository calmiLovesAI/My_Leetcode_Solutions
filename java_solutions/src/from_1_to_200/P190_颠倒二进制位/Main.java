package from_1_to_200.P190_颠倒二进制位;


class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;

    }
}

public class Main {
    public static void main(String[] args) {

    }
}

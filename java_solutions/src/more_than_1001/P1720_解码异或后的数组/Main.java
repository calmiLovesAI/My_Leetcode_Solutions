package from_801_to_1000.P1720_解码异或后的数组;

/*
异或的性质：
异或运算满足交换律和结合律；
任意整数和自身做异或运算的结果都等于0，
任意整数和0做异或运算的结果都等于其自身

 */
class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] ori = new int[n+1];
        ori[0] = first;
        for (int i = 1; i < n+1; i++) {
            ori[i] = ori[i-1] ^ encoded[i-1];
        }
        return ori;
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

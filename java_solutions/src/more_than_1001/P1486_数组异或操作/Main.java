package more_than_1001.P1486_数组异或操作;


class Solution {
    public int xorOperation(int n, int start) {
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans ^= start + 2 * i;
        }
        return ans;
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

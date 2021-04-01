package from_1_to_200.P191_位1的个数;


class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1'){
                ans++;
            }
        }
        return ans;
    }
}


class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0){
            n = n&(n-1);
            ans++;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

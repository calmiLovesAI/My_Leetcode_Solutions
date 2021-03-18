package from_201_to_400.P231_2的幂;


class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0){
            return false;
        }

        while (n%2==0){
            n = n / 2;
        }
        return n == 1;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isPowerOfTwo(16));
    }
}

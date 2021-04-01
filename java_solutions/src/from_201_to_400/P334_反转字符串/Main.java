package from_201_to_400.P334_反转字符串;

import java.util.Arrays;

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        if (n >= 2){
            int i = 0, j = n-1;
            while (i < j){
                char t = s[i];
                s[i] = s[j];
                s[j] = t;
                i++;
                j--;
            }

        }
    }
}

public class Main {
    public static void main(String[] args) {
        char[] a = new char[]{'h','e','l','l','o'};
        new Solution().reverseString(a);
        System.out.println(Arrays.toString(a));
    }
}

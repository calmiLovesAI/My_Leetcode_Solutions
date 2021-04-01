package from_1_to_200.P28_实现strStr;


class Solution {
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m-n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (needle.charAt(j) != haystack.charAt(i+j)){
                    break;
                }
            }
            if (j == n){
                return i;
            }
        }
        return -1;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().strStr("", ""));
    }
}

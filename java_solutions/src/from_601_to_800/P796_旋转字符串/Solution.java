package from_601_to_800.P796_旋转字符串;

public class Solution {
    public boolean rotateString(String A, String B) {
        return (A.length() == B.length()) && ((A + A).contains(B));
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.rotateString("abcde", "cdeab"));
    }
}

package more_than_1001.P1844_将所有数字用字符替换;


class Solution {
    public String replaceDigits(String s) {
        int n = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (i % 2 == 1) {
                // i是奇数
                char c1 = (char) (s.charAt(i-1) + Integer.parseInt(String.valueOf(c)));
                stringBuilder.append(c1);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

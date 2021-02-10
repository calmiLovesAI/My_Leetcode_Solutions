package from_1_to_200.P76_最小覆盖子串;


class Solution {
    public String minWindow(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen < tLen){
            return "";
        }

        char[] charArrayT = t.toCharArray();
        char[] charArrayS = s.toCharArray();

        int[] winFreq = new int[128];
        int[] tFreq = new int[128];

        for (char c : charArrayT){
            tFreq[c]++;
        }
        int distance = 0;    // 滑动窗口中包含多少个T中的字符
        // 设置minLen和begin的原因是有多个局部最小长度的覆盖子串
        int minLen = sLen + 1;   // 极大值
        int begin = 0;

        int left = 0, right = 0;   // [left, right)
        while (right < sLen){
            if (tFreq[charArrayS[right]] == 0){
                right++;
                continue;
            }
            // 字符存在于t中
            if (winFreq[charArrayS[right]] < tFreq[charArrayS[right]]){
                distance++;
            }
            winFreq[charArrayS[right]]++;
            right++;

            while (distance == tLen){
                if (right - left < minLen){
                    minLen = right - left;
                    begin = left;
                }
                if (tFreq[charArrayS[left]] == 0){
                    left++;
                    continue;
                }
                if (winFreq[charArrayS[left]] == tFreq[charArrayS[left]]){
                    distance--;
                }
                winFreq[charArrayS[left]]--;
                left++;
            }
        }

        if (minLen == sLen + 1){
            return "";
        }

        return s.substring(begin, begin + minLen);

    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().minWindow("ADOBECODEBANC", "ABC"));
    }
}

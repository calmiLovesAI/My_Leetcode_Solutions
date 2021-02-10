package from_401_to_600.P567_字符串的排列;


// 排列不讲究顺序，但是字符种类和每种字符出现的数量相等
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] pattern = s1.toCharArray();
        char[] text = s2.toCharArray();
        int[] pFreq = new int[26];
        int[] winFreq = new int[26];
        int pLen = s1.length();
        int tLen = s2.length();
        int pCount = 0;
        int winCount = 0;

        for (int i = 0; i < pLen; i++) {
            pFreq[pattern[i] - 'a']++;
        }

        for (int e : pFreq){
            if (e > 0){
                pCount++;
            }
        }


        int left = 0, right = 0;

        while (right < tLen){
            if (pFreq[text[right] - 'a'] > 0){
                winFreq[text[right] - 'a']++;
                if (pFreq[text[right] - 'a'] == winFreq[text[right] - 'a']){
                    winCount++;
                }
            }
            right++;

            while (winCount == pCount){
                if (right - left == pLen){
                    return true;
                }


                if (pFreq[text[left] - 'a'] > 0){
                    winFreq[text[left] - 'a']--;
                    if (winFreq[text[left] - 'a'] < pFreq[text[left] - 'a']){
                        winCount--;
                    }
                }

                // 左指针右移
                left++;
            }
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().checkInclusion("ab", "eidbaooo"));
    }
}

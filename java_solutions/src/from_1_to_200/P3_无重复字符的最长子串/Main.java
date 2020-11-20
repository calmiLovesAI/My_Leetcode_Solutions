package from_1_to_200.P3_无重复字符的最长子串;


import java.util.HashMap;

//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int start = 0, end = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!hashMap.containsKey(c)){
                hashMap.put(c, i);
            }else{
                int repeat = hashMap.get(c);
                if (repeat >= start){
                    start = repeat + 1;
                }
                hashMap.put(c, i);
            }
            end ++;
            ans = Math.max(end - start, ans);
        }
        return ans;
    }
}



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.lengthOfLongestSubstring("aabaab!bb"));
    }
}

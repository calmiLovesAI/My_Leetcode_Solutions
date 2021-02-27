package from_201_to_400.P395_至少有K个重复字符的最长子串;


import java.util.HashMap;

// 递归
class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k){
            return 0;
        }
        HashMap<Character, Integer> hashMap = new HashMap<>();
        // 统计字符串s中每个字符出现的次数
        for (int i = 0; i < s.length(); i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : hashMap.keySet()){
            if (hashMap.get(c) < k){
                // 包含字符c的子字符串都不满足要求
                int res = 0;
                for (String t : s.split(String.valueOf(c))){
                    res = Math.max(res, longestSubstring(t, k));
                }
                return res;
            }
        }
        return s.length();
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().longestSubstring("aaabb", 3));
    }
}

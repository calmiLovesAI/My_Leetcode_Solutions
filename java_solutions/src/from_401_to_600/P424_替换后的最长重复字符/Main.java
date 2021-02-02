package from_401_to_600.P424_替换后的最长重复字符;

/*   双指针：
枚举字符串中的每一个位置作为右端点，然后找到其最远的左端点的位置，
满足该区间内除了出现次数最多的那一类字符之外，剩余的字符（即非最长重复字符）数量不超过k个
 */

public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.characterReplacement("AABABBA", 1));
    }
}



class Solution {
    public int characterReplacement(String s, int k) {
        // 双指针
        int n = s.length();
        int l = 0, r = 0;
        // 用一个数组存储当前字符切片中的各个字符出现次数
        int[] arr = new int[26];
        // 字符切片中出现次数最多的字符出现次数
        int maxNum = 0;

        while (r < n){
            int idx = s.charAt(r) - 'A';
            arr[idx]++;
            maxNum = Math.max(maxNum, arr[idx]);
            if ((r - l + 1 - maxNum) > k){
                // 更新数组
                arr[s.charAt(l)-'A']--;
                l++;
            }
            r++;
        }
        return r-l;
    }
}
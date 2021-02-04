package more_than_1001.P1208_尽可能使字符串相等;



// 双指针
// 这道题的意思是s中字符转换到t中的字符是位置对应的，也就是s[i]只能转换到t[i]，而不能是t[j](j!=i)
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }

        int start = 0, end = 0;
        int ans = 0;
        int sum = 0;
        while (end < n){
            sum += diff[end];
            while (sum > maxCost && start <= end){
                sum -= diff[start];
                start++;
            }
            ans = Math.max(ans, end - start + 1);
            end++;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().equalSubstring("abcd", "bcdf", 3));
    }
}

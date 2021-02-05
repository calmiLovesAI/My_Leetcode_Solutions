package from_801_to_1000.P830_较大分组的位置;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();
        int start = 0, end = 0;
        while (end < s.length()){
            if (s.charAt(start) != s.charAt(end)){
                if (end - start >= 3){
                    List<Integer> loc = new ArrayList<>();
                    loc.add(start);
                    loc.add(end-1);
                    ans.add(loc);
                }
                start = end;
            }else{
                if ((end == s.length() - 1) && (end - start + 1 >= 3)){
                    List<Integer> loc = new ArrayList<>();
                    loc.add(start);
                    loc.add(end);
                    ans.add(loc);
                }
                end++;
            }

        }
        return ans;
    }
}


// LeetCode的官方解法
class Solution2{
    public List<List<Integer>> largeGroupPositions(String s){
        List<List<Integer>> ret = new ArrayList<>();
        int n = s.length();
        int num = 1;   // 某个字符至少和它本身相同
        for (int i = 0; i < n; i++) {
            if (i == n-1 || s.charAt(i) != s.charAt(i+1)){
                if (num >= 3){
                    ret.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            }else{
                num++;
            }
        }
        return ret;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().largeGroupPositions("aaa"));
    }
}

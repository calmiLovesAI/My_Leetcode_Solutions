package from_1_to_200.P131_分割回文串;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    boolean[][] f;
    List<List<String>> ret = new ArrayList<>();
    List<String> ans = new ArrayList<>();
    int n;


    public List<List<String>> partition(String s) {
        n = s.length();
        f = new boolean[n][n];    // f[i][j]是否为回文串
        for (int i = 0; i < n; i++) {
            Arrays.fill(f[i], true);
        }

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j < n; j++) {
                f[i][j] = f[i+1][j-1] && (s.charAt(i) == s.charAt(j));
            }
        }

        dfs(s, 0);
        return ret;
    }

    public void dfs(String s, int i){
        if (i == n){
            ret.add(new ArrayList<>(ans));
            return;
        }
        for (int j = i; j < n; j++) {
            if (f[i][j]){
                ans.add(s.substring(i, j+1));
                dfs(s, j+1);
                ans.remove(ans.size()-1);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

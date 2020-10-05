package 剑指offer.P13_机器人的运动范围;


class Solution {
    private int m;
    private int n;
    private int k;
    private int ans;
    private boolean[][] visited;

    private int sumOfDigits(int x){
        String s = String.valueOf(x);
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        return sum;
    }


    private void dfs(int i, int j){
        if(i < 0 || j < 0 || i >= m || j >= n){
            return;
        }
        if(sumOfDigits(i) + sumOfDigits(j) > k){
            return;
        }
        if(!visited[i][j]){
            visited[i][j] = true;
            ans += 1;
            // 只需考虑向下和向右两个方向
//            dfs(i-1, j);
            dfs(i+1, j);
//            dfs(i, j-1);
            dfs(i, j+1);
        }
    }


    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        ans = 0;
        dfs(0, 0);
        return ans;
    }
}



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.movingCount(2, 3, 1));
    }
}

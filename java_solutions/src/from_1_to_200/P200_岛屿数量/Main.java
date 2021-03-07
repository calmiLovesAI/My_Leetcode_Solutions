package from_1_to_200.P200_岛屿数量;

class Solution {

    int m;
    int n;
    boolean[][] searched;
    int ans;

    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        searched = new boolean[m][n];
        ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!searched[i][j] && grid[i][j] == '1'){
                    ans++;
                    dfs(grid, i, j);
                }
            }
        }
        return ans;
    }

    public void dfs(char[][] grid, int x, int y){
        if (x < 0 || x >= m || y < 0 || y >= n || searched[x][y] || grid[x][y] == '0'){
            return;
        }
        searched[x][y] = true;
        dfs(grid, x+1, y);
        dfs(grid, x-1, y);
        dfs(grid, x, y+1);
        dfs(grid, x, y-1);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

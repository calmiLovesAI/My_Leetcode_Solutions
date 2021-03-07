package from_1_to_200.P130_被围绕的区域;

class Solution {
    int n, m;

    public void solve(char[][] board) {
        n = board.length;
        if (n == 0){
            return;
        }
        m = board[0].length;

        // 从边界处找“O”
        for (int i = 0; i < n; i++) {
            dfs(board, i, 0);
            dfs(board, i, m-1);
        }

        for (int i = 0; i < m; i++) {
            dfs(board, 0, i);
            dfs(board, n-1, i);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 'M'){
                    board[i][j] = 'O';
                }else if (board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }

    }

    public void dfs(char[][] board, int x, int y){
        if (x < 0 || x >= n || y < 0 || y >= m || board[x][y] != 'O'){
            return;
        }
        board[x][y] = 'M';    // 标记这个点不需要被修改
        dfs(board, x-1, y);
        dfs(board, x+1, y);
        dfs(board, x, y-1);
        dfs(board, x, y+1);
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

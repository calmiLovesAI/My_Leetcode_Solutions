package 剑指offer.P12_矩阵中的路径;

class Solution {
    private char[][] mat;
    private String w;

    public boolean recursion(int i, int j, int k) {
        char ch = w.charAt(k);
        if (i < 0 || j < 0 || i >= mat.length || j >= mat[0].length || ch != mat[i][j]) {
            return false;
        }
        if (k == w.length() - 1) {
            return true;
        }
        if (k < w.length() - 1 && ch != mat[i][j]) {
            return false;
        }

        char t = mat[i][j];
        mat[i][j] = '*';
        // 上、下、左、右 4个方向搜索
        // 如果不写成“||”的形式会超时
        boolean ans = (recursion(i - 1, j, k + 1)) || (recursion(i + 1, j, k + 1)) || (recursion(i, j - 1, k + 1)) || (recursion(i, j + 1, k + 1));
        mat[i][j] = t;

        return ans;
    }

    public boolean exist(char[][] board, String word) {
        mat = board;
        w = word;
        int p = mat.length;
        int q = mat[0].length;


        // 找到开始位置
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                if(recursion(i, j, 0)){
                    return true;
                }
            }
        }

        return false;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

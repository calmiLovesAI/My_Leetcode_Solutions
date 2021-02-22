package from_601_to_800.P766_托普利茨矩阵;


class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                if (i - 1 >= 0 && j - 1 >= 0 && matrix[i-1][j-1] != matrix[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }
}

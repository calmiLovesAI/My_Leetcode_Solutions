package 剑指offer.P4_二维数组中的查找;


class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        // 判断矩阵是否为空
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return false;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int i,j;
        i = 0;
        j = n - 1;

        while (j>=0 && i <m){
            int current = matrix[i][j];
            if(target == current){
                return true;
            }else if (target < current){
                j--;
            }else{
                i++;
            }
        }

        return false;
    }
}



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] m = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}};
        System.out.println(s.findNumberIn2DArray(m, 5));

    }
}

package more_than_1001.P5518;


import java.util.Arrays;

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {

        // m 行，n列
        int m = rowSum.length;
        int n = colSum.length;
        int[][] ans = new int[m][n];
//        if(m==1 || n == 1){
//            for(int i=0;i<m;i++){
//                for(int j =0;j<n;j++){
//                    ans[i][j] = Math.min(rowSum[i], colSum[j]);
//                }
//            }
//        }
//
//        int[] row = Arrays.copyOfRange(rowSum, 1, m);
//        int[] col = Arrays.copyOfRange(colSum, 1, n);
//
//        // 递归
//        int[][] mat = restoreMatrix(row, col);
//
//        for(int i = 1;i<=n;i++){
//            ans[i] = colSum[i] - col[i-1];
//        }
        return ans;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
    }
}

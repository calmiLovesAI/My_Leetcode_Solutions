package from_201_to_400.P363_矩形区域不超过K的最大数值和;

import java.util.TreeSet;

class Solution {
    public int maxSumSubmatrix(int[][] matrix, int k) {
        int ans = Integer.MIN_VALUE;
        int m = matrix.length, n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            //  枚举上边界
            int[] sum = new int[n];
            for (int j = i; j < m; j++) {
                // 枚举下边界
                for (int c = 0; c < n; c++){
                    sum[c] += matrix[j][c];
                }
                TreeSet<Integer> sumSet = new TreeSet<>();
                sumSet.add(0);
                int s = 0;
                for (int v : sum){
                    s += v;
                    Integer ceil = sumSet.ceiling(s - k);
                    if (ceil != null){
                        ans = Math.max(ans, s - ceil);
                    }
                    sumSet.add(s);
                }
            }
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSumSubmatrix(new int[][]{{1, 0, 1}, {0, -2, 3}}, 2));
    }
}

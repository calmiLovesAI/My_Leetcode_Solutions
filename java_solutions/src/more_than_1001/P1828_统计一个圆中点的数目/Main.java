package from_801_to_1000.P1828_统计一个圆中点的数目;

class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int cX = queries[i][0], cY = queries[i][1], cR = queries[i][2];
            int cnt = 0;
            for (int[] point : points) {
                int pX = point[0];
                int pY = point[1];
                if ((cX - pX) * (cX - pX) + (cY - pY) * (cY - pY) <= cR * cR) {
                    cnt++;
                }
            }
            ans[i] = cnt;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

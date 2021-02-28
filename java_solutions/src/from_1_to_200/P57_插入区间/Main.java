package from_1_to_200.P57_插入区间;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int left = newInterval[0], right = newInterval[1];
        boolean placed = false;
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int[] interval: intervals) {
            if (interval[0] > right){
                // 在插入区间的右侧且无交集
                if (!placed){
                    arrayList.add(new int[]{left, right});
                    placed = true;
                }
                arrayList.add(interval);
            }else if (interval[1] < left){
                // 在插入区间的左侧且无交集
                arrayList.add(interval);
            }else{
                // 有交集
                left = Math.min(interval[0], left);
                right = Math.max(interval[1], right);
            }

        }
        if (!placed){
            arrayList.add(new int[]{left, right});
        }
        int[][] ans = new int[arrayList.size()][2];
        for (int i = 0; i < arrayList.size(); i++){
            ans[i][0] = arrayList.get(i)[0];
            ans[i][1] = arrayList.get(i)[1];
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(new Solution().insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})));
    }
}

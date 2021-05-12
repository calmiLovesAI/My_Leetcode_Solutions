package more_than_1001.P1310_子数组异或查询;

import java.util.Arrays;

// 暴力解法
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int left =  queries[i][0];
            int right = queries[i][1];
            int t = 0;
            for (int j = left; j <= right; j++) {
                t ^= arr[j];
            }
            ans[i] = t;
        }
        return ans;
    }
}


// “前缀和”思想
class Solution2{
    public int[] xorQueries(int[] arr, int[][] queries){
        int[] xorArr = new int[arr.length];
        xorArr[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            xorArr[i] = xorArr[i-1] ^ arr[i];
        }
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            if (left == 0){
                ans[i] = xorArr[right];
            }else{
                ans[i] = xorArr[left-1] ^ xorArr[right];
            }

        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(Arrays.toString(s.xorQueries(new int[]{1, 3, 4, 8}, new int[][]{{0, 1}, {1, 2}, {0, 3}, {3, 3}})));
    }
}

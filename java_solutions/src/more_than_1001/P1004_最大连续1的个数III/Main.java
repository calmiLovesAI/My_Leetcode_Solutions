package more_than_1001.P1004_最大连续1的个数III;

/*
本题是求最大连续子区间，可以使用滑动窗口方法。滑动窗口的限制条件是：窗口内最多有 K 个 0。
 */
class Solution {
    public int longestOnes(int[] A, int K) {
        int n = A.length;
        int ans = 0;
        int numZero = 0;
        int left = 0, right = 0;
        while (right < n){
            if (A[right] == 0){
                numZero++;
            }
            while (numZero > K){
                if (A[left] == 0){
                    numZero--;
                }
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }
}

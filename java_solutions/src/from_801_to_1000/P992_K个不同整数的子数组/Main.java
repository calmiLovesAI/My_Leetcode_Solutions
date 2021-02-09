package from_801_to_1000.P992_K个不同整数的子数组;


// 双指针
/*
最多包含K个不同整数的子区间的个数 - 最多包含K-1个不同整数的子区间的个数 == 恰好包含K个不同整数的子区间的个数
 */

// 时间复杂度：O(N)，空间复杂度：O(N)
class Solution {
    public int subarraysWithKDistinct(int[] A, int K) {
        return atMostKWithKDistinct(A, K) - atMostKWithKDistinct(A, K - 1);
    }

    private int atMostKWithKDistinct(int[] A, int K) {
        int n = A.length;
        int left = 0, right = 0;
        int[] freq = new int[n + 1];
        int ans = 0;
        int cnt = 0;     // 记录当前区间[left, right)范围内有多少个不同的整数
        while (right < n) {
            if (freq[A[right]] == 0) {
                cnt++;
            }
            freq[A[right]]++;
            while (cnt > K) {
                freq[A[left]]--;
                if (freq[A[left]] == 0) {
                    cnt--;
                }
                left++;
            }
            right++;
            ans += right - left;
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().subarraysWithKDistinct(new int[]{1, 2, 1, 2, 3}, 2));
    }
}

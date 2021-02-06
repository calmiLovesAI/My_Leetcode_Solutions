package more_than_1001.P1423_可获得的最大点数;

import java.util.Arrays;

// 等价于求一个固定长度的数组片段的和的最小值
// 直接使用滑动窗口
class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int totalSum = Arrays.stream(cardPoints).sum();

        int slidingWindowSum = 0;
        for (int i = 0; i < n-k; i++){
            slidingWindowSum += cardPoints[i];
        }
        int minSum = slidingWindowSum;

        for (int i = 0; i < k; i++) {
            int j = i + (n - k);
            slidingWindowSum = slidingWindowSum + cardPoints[j] - cardPoints[i];
            minSum = Math.min(minSum, slidingWindowSum);
        }

        return totalSum - minSum;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maxScore(new int[]{1, 1000, 1}, 1));
    }
}

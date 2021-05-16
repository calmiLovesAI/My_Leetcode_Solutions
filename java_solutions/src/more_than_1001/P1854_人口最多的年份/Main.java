package more_than_1001.P1854_人口最多的年份;


class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int[] log : logs){
            arr[log[0] - 1950]++;
            arr[log[1] - 1950]--;
        }

        int maxV = 0;
        int cur = 0;
        int minIdx = 0;
        for (int i = 0; i < 101; i++) {
            cur += arr[i];
            if (cur > maxV){
                maxV = cur;
                minIdx = i + 1950;
            }
        }
        return minIdx;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

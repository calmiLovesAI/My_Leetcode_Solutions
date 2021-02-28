package from_801_to_1000.P896_单调数列;

class Solution {
    public boolean isMonotonic(int[] A) {
        int n = A.length;
        if (n <= 2){
            return true;
        }
        boolean increase = true, decrease = true;
        for (int i = 0; i < n - 1; i++) {
            if (A[i + 1] < A[i]) {
                increase = false;
            }
            if (A[i + 1] > A[i]) {
                decrease = false;
            }
        }
        return increase || decrease;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().isMonotonic(new int[]{2, 2, 2, 1, 4, 5}));
    }
}

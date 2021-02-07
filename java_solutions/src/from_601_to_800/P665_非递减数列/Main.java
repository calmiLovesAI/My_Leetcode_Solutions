package from_601_to_800.P665_非递减数列;

class Solution {
    public boolean checkPossibility(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for (int i = 0; i < n-1; i++) {
            if (nums[i] > nums[i+1]){
                cnt++;
                if (cnt>1){
                    return false;
                }
                if (i>=1 && nums[i+1] < nums[i-1]){
                    nums[i+1] = nums[i];
                }

            }
        }
        return true;
    }
}



public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().checkPossibility(new int[]{-1, 4, 2, 3}));
    }
}

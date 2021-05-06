package from_601_to_800.P740_删除并获得点数;


class Solution {
    public int deleteAndEarn(int[] nums) {
        int maxVal = 0;
        for (int e: nums){
            maxVal = Math.max(maxVal, e);
        }
        int[] sum = new int[maxVal+1];
        for (int e : nums){
            sum[e] += e;
        }
        return rob(sum);
    }


    private int rob(int[] nums){
        int size = nums.length;
        int first = nums[0], second = Math.max(nums[0], nums[1]);
        for (int i = 2; i <  size; i++){
            int t = second;
            second = Math.max(first + nums[i], second);
            first = t;
        }
        return second;
    }

}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}

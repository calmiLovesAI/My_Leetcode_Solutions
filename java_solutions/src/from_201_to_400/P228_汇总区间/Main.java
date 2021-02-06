package from_201_to_400.P228_汇总区间;


import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while (i < n){
            int low = i;
            i++;
            while (i < n && nums[i] == nums[i-1] + 1){
                i++;
            }
            int high = i - 1;
            StringBuilder stringBuilder = new StringBuilder(Integer.toString(nums[low]));
            if (low < high){
                stringBuilder.append("->");
                stringBuilder.append(Integer.toString(nums[high]));
            }
            ans.add(stringBuilder.toString());
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}

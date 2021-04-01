package from_1_to_200.P90_子集II;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{

    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> t = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            boolean flag = true;
            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                ans.add(new ArrayList<Integer>(t));
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
    }
}

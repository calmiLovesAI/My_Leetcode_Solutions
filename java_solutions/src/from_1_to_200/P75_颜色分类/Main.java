package from_1_to_200.P75_颜色分类;


import java.util.Arrays;

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if (n == 1){
            return;
        }
        // 排类别0
        int i = 0;
        while (i < n && nums[i] == 0){
            i++;
        }
        if (i == n){
            return;
        }
        int j = i;
        while (j < n){
            if (nums[j] == 0 && i != j){
                // 交换i与j处的值
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
            }
            j++;
        }
        // 双指针排1和2
        int p = i, q = n-1;
        while (p < q){
            while (p < q && nums[p] == 1){
                p++;
            }
            while (p < q && nums[q] == 2){
                q--;
            }
            if (p < q){
                // 交换
                int t = nums[p];
                nums[p] = nums[q];
                nums[q] = t;
            }
        }

    }
}




public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0,2,1,1,0};
        new Solution().sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}

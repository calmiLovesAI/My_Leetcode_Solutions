package from_201_to_400.P303_区域和检索数组不可变;


//class NumArray {
//    public int[] nums;
//
//    public NumArray(int[] nums) {
//        this.nums = nums;
//    }
//
//    public int sumRange(int i, int j) {
//        int ans = 0;
//        for (int k = i;k <= j;k++){
//            ans += this.nums[k];
//        }
//        return ans;
//    }
//}


import java.util.Arrays;

// 使用前缀和优化
/*
要计算 sumRange(i,j)，则需要计算数组nums在下标 j 和下标 i−1的前缀和，然后计算两个前缀和的差。
 */
class NumArray {
    public int[] sums;    // 前缀和

    public NumArray(int[] nums) {
        int n = nums.length;
        sums = new int[n+1];
        for (int i = 1; i <= n; i++) {
            sums[i] = sums[i-1] + nums[i-1];      // sums[i]代表 0 ~ i-1之间的数字和
        }

    }

    public int sumRange(int i, int j) {
        return sums[j+1] - sums[i];
    }
}

public class Main {
    public static void main(String[] args) {
         NumArray obj = new NumArray(new int[]{-2, 0, 3, -5, 2, -1});
        System.out.println(obj.sumRange(0,5));
    }
}

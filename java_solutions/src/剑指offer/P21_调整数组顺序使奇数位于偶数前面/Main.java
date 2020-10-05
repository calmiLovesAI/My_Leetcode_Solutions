package 剑指offer.P21_调整数组顺序使奇数位于偶数前面;


class Solution {
    public int[] exchange(int[] nums) {
        int i, j;
        i = 0;
        j = nums.length - 1;
        while (i < j){
            while (i<j && nums[i]%2==1){
                i++;
            }
            while (i<j && nums[j]%2==0){
                j--;
            }
            if(i<j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
            }
        }
        return nums;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

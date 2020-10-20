//package from_401_to_600.P416_分割等和子集;
//
//import java.util.Arrays;
//
//class Solution {
//    public boolean canPartition(int[] nums) {
//        // 动态规划
//        int n = nums.length;
//        if (n < 2){
//            return false;
//        }
//        int sum = 0;
//        int maxNum = 0;
//        for (int i:nums){
//            sum += i;
//            maxNum = Math.max(maxNum, i);
//        }
//
//        if (sum % 2 == 1){
//            return false;
//        }
//        int target = sum / 2;
//        if (maxNum > target){
//            return false;
//        }
//
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("");
//    }
//}

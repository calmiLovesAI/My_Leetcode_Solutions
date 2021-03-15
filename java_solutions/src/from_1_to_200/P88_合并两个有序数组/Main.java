package from_1_to_200.P88_合并两个有序数组;


import java.util.Arrays;

class Solution1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < nums2.length; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}

// 双指针
class Solution2{
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1, p2 = n -1;
        int p = m+n-1;
        while (p1 >= 0 && p2 >= 0){
            nums1[p] = (nums1[p1] > nums2[p2])? nums1[p1--]:nums2[p2--];
            p--;
        }
        if (p2 + 1 >= 0) System.arraycopy(nums2, 0, nums1, 0, p2 + 1);

    }
}

public class Main {
    public static void main(String[] args) {

    }
}

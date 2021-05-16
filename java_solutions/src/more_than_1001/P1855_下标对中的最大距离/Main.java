package more_than_1001.P1855_下标对中的最大距离;



// 双指针
class Solution {
    public int maxDistance(int[] nums1, int[] nums2){
        int n1 = nums1.length;
        int n2 = nums2.length;
        int i = 0;
        int ans = 0;
        for (int j = 0; j < n2; j++) {
            while (i < n1 && nums1[i] > nums2[j]){
                i++;
            }
            if (i < n1){
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

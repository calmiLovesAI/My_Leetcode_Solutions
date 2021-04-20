package from_1_to_200.P26_删除有序数组中的重复项;


class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n < 2){
            return n;
        }
        int slow = 1, fast = 1;
        while (fast < n){
            if (nums[fast] != nums[fast-1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

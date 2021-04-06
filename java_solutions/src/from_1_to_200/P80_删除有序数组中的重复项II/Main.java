package from_1_to_200.P80_删除有序数组中的重复项II;

class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2){
            return n;
        }
        int slow = 2, fast = 2;
        while (fast < n){
            if (nums[slow - 2] != nums[fast]){
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

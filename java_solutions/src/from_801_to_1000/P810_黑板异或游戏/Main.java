package from_801_to_1000.P810_黑板异或游戏;

class Solution {
    public boolean xorGame(int[] nums) {
        //  Alice胜利的条件：数组长度是偶数，或者全部元素异或结果为0
        if (nums.length % 2 == 0){
            return true;
        }
        int ans = 0;
        for (int e : nums){
            ans ^= e;
        }
        return ans == 0;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

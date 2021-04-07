package LCP.P1_猜数字;


class Solution {
    public int game(int[] guess, int[] answer) {
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (guess[i] == answer[i]){
                ans++;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

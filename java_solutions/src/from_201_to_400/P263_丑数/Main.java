package from_201_to_400.P263_丑数;

class Solution {
    public boolean isUgly(int num) {
        if (num <= 0){
            return false;
        }

        int[] factors = {2, 3, 5};
        for (int factor : factors){
            while (num % factor == 0){
                num = num / factor;
            }
        }
        return num == 1;
    }
}

public class Main {
    public static void main(String[] args) {

    }
}

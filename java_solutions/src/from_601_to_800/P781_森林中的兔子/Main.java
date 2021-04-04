package from_601_to_800.P781_森林中的兔子;



import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // 统计相同数字出现的次数
        for (int y : answers){
            hashMap.put(y, hashMap.getOrDefault(y, 0) + 1);
        }

        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()){
            int y = entry.getKey();
            int x = entry.getValue();
            ans += (x + y) / (y + 1) * (y + 1);
        }
        return ans;
    }
}



public class Main {
    public static void main(String[] args) {

    }
}

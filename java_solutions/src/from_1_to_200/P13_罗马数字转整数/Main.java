package from_1_to_200.P13_罗马数字转整数;


import java.util.HashMap;

class Solution {

    public HashMap<Character, Integer> hashMap = new HashMap<>();

    public int romanToInt(String s) {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            int num = hashMap.get(c);
            if (i < n - 1 && num < hashMap.get(s.charAt(i+1))){
                ans -= num;
            }else{
                ans += num;
            }
        }
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().romanToInt("MCMXCIV"));
    }
}

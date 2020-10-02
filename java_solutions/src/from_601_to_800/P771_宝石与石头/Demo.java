package from_601_to_800.P771_宝石与石头;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public int numJewelsInStones(String J, String S) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i ++){
            set.add(J.charAt(i));
        }
        for(int k = 0; k < S.length(); k++){
            if (set.contains(S.charAt(k))){
                ans ++;
            }
        }
        return ans;
    }
}



public class Demo {
    public static void main(String[] args) {
        System.out.println("");
    }
}

package from_801_to_1000.P844_比较含退格的字符串;


import java.util.LinkedList;

class Solution {
    public boolean backspaceCompare(String S, String T) {
        LinkedList<Character> stk1 = new LinkedList<>();
        LinkedList<Character> stk2 = new LinkedList<>();

        int sLength = S.length();
        int tLength = T.length();

        for (int i = 0; i < sLength; i++){
            char c = S.charAt(i);
            if (c == '#' && !stk1.isEmpty()){
                stk1.removeLast();
            }
            if (c != '#'){
                stk1.addLast(c);
            }
        }

        for (int i = 0; i < tLength; i++){
            char c = T.charAt(i);
            if (c == '#' && !stk2.isEmpty()){
                stk2.removeLast();
            }
            if (c != '#'){
                stk2.addLast(c);
            }
        }

        while (!(stk1.isEmpty()||stk2.isEmpty())){
            if (stk1.removeLast() != stk2.removeLast()){
                return false;
            }
        }
        return stk1.isEmpty() && stk2.isEmpty();

    }
}



public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.backspaceCompare("bxj##tw", "bxo#j##tw"));
    }
}

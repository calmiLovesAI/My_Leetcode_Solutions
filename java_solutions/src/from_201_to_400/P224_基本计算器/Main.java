package from_201_to_400.P224_基本计算器;


import java.util.LinkedList;

class Solution {
    public int calculate(String s) {
        int res = 0, num = 0, sign = 1;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                num = 10 * num + Integer.parseInt(String.valueOf(c));
            }else if (c == '+' || c == '-'){
                res += sign * num;
                num = 0;
                sign = c == '+'? 1:-1;
            }else if (c == '('){
                linkedList.addLast(res);
                linkedList.addLast(sign);
                res = 0;
                sign = 1;
            }else if (c == ')'){
                res += sign * num;
                num = 0;
                res *= linkedList.removeLast();
                res += linkedList.removeLast();
            }
        }
        res += sign * num;
        return res;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

package from_201_to_400.P227_基本计算器II;


import java.util.LinkedList;

class Solution {
    public int calculate(String s) {
        LinkedList<Integer> stack = new LinkedList<>();
        char preSign = '+';
        int num = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)){
                num = num * 10 + Integer.parseInt(String.valueOf(c));
            }
            if (!Character.isDigit(c) && c != ' ' || i == n-1){
                switch (preSign){
                    case '+':
                        stack.addLast(num);
                        break;
                    case '-':
                        stack.addLast(-num);
                        break;
                    case '*':
                        stack.add(stack.removeLast() * num);
                        break;
                    default:
                        stack.add(stack.removeLast() / num);

                }
                preSign = c;
                num = 0;
            }
        }
        int ans = 0;
        while (!stack.isEmpty()){
            ans += stack.removeLast();
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

package LCP.P17_速算机器人;

class Solution {
    private int x = 1;
    private int y = 0;


    private void A(){
        x = 2 * x + y;
    }

    private void B(){
        y = 2 * y + x;
    }

    public int calculate(String s) {
        for (Character c : s.toCharArray()){
            if (c == 'A'){
                A();
            }
            if (c == 'B'){
                B();
            }
        }
        return x + y;
    }

}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().calculate("AB"));
    }
}

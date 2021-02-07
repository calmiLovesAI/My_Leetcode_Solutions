package 面试题.P1607_最大数值;


/*
编写一个方法，找出两个数字a和b中最大的那一个。不得使用if-else或其他比较运算符。
 */
class Solution {
    public int maximum(int a, int b) {
        return (int) ((Math.abs((long) a - (long) b) + (long) a + (long) b) / 2);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().maximum(1, 2));
    }
}

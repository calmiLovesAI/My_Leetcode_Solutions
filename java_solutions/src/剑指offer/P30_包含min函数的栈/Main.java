package 剑指offer.P30_包含min函数的栈;


import java.util.LinkedList;

class MinStack {
    private LinkedList<Integer> s1;
    private LinkedList<Integer> s2;

    /** initialize your data structure here. */
    public MinStack() {
        // 构造一个辅助栈
        s1 = new LinkedList<>();
        s2 = new LinkedList<>();
    }

    public void push(int x) {
        if (s1.isEmpty()){
            s1.addLast(x);
            s2.addLast(x);
        }else{
            int topValue = s2.getLast();
            s1.addLast(x);
            s2.addLast(Math.min(x, topValue));
        }
    }

    public void pop() {
        s1.removeLast();
        s2.removeLast();
    }

    public int top() {
        return s1.getLast();
    }

    public int min() {
        return s2.getLast();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.min();
 */



public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

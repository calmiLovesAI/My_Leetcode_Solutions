package 剑指offer.P9_用两个栈实现队列;

import java.util.ArrayDeque;

class CQueue {
    private ArrayDeque<Integer> s1;
    private ArrayDeque<Integer> s2;

    public CQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }

    public void appendTail(int value) {
        s1.addLast(value);
    }

    public int deleteHead() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.addLast(s1.removeLast());
            }
        }

        if (s2.isEmpty()) {
            return -1;
        }
        return s2.removeLast();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

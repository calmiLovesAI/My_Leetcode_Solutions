package from_201_to_400.P225_用队列实现栈;


import java.util.LinkedList;

class MyStack {

    LinkedList<Integer> queueA;

    /** Initialize your data structure here. */
    public MyStack() {
       queueA = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        int n = queueA.size();
        queueA.addLast(x);
        for (int i = 0; i < n; i++) {
            queueA.addLast(queueA.removeFirst());
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return queueA.removeFirst();
    }

    /** Get the top element. */
    public int top() {
        return queueA.getFirst();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queueA.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class Main {
    public static void main(String[] args) {

    }
}

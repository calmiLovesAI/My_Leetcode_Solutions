package from_201_to_400.P232_用栈实现队列;


import java.util.LinkedList;

class MyQueue {
    LinkedList<Integer> stackA;
    LinkedList<Integer> stackB;

    /** Initialize your data structure here. */
    public MyQueue() {
       stackA = new LinkedList<>();
       stackB = new LinkedList<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        stackA.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (stackB.isEmpty()){
            while (!stackA.isEmpty()){
                stackB.addLast(stackA.removeLast());
            }
        }
        return stackB.removeLast();
    }

    /** Get the front element. */
    public int peek() {
        if (stackB.isEmpty()){
            while (!stackA.isEmpty()){
                stackB.addLast(stackA.removeLast());
            }
        }
        return stackB.getLast();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackA.isEmpty() && stackB.isEmpty();
    }
}


public class Main {
    public static void main(String[] args) {

    }
}

package 剑指offer.P31_栈的压入与弹出序列;


import java.util.LinkedList;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // 构建一个辅助栈
        LinkedList<Integer> stk = new LinkedList<>();
        // 构建一个队列，用来存储入栈的序列
        LinkedList<Integer> pushQueue = new LinkedList<>();
        // 初始化
        for (int e: pushed){
            pushQueue.addLast(e);
        }

        boolean ans = true;
        for (int e:popped){
            if (stk.isEmpty() || stk.getLast() != e){
                // 要弹出的元素不在栈顶，则将队列e中找到它并入栈，找不到，即为false
                while (!pushQueue.isEmpty()){

                    if (pushQueue.getFirst() == e){
                        stk.addLast(pushQueue.removeFirst());
                        break;
                    }else{
                        stk.addLast(pushQueue.removeFirst());
                    }
                }
                if (stk.getLast() != e){
                    ans = false;
                    break;
                }else{
                    stk.removeLast();
                }
            }else{
                stk.removeLast();
            }
        }
        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4, 5, 3, 2, 1}));
    }
}

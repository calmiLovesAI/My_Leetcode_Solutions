package more_than_1001.P1006_笨阶乘;

import java.util.ArrayList;
import java.util.LinkedList;

// 栈操作，先乘除后加减
class Solution {
    public int clumsy(int N) {
        int cnt = 0;
        int ans = 0;
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(N);
        for (int i = N-1; i >= 1; i--) {
            cnt++;
            if (cnt % 4 == 1){
                linkedList.addLast(linkedList.removeLast() * i);
            }else if (cnt % 4 == 2){
                linkedList.addLast(linkedList.removeLast() / i);
            }else if (cnt % 4 == 3){
                linkedList.addLast(i);
            }else {
                linkedList.addLast(-i);
            }
        }
        while (!linkedList.isEmpty()){
            ans += linkedList.removeLast();
        }
        return ans;
    }
}


// 数学方法
class Solution1 {
    public int clumsy(int N) {
        if (N == 1) {
            return 1;
        } else if (N == 2) {
            return 2;
        } else if (N == 3) {
            return 6;
        } else if (N == 4) {
            return 7;
        }

        if (N % 4 == 0) {
            return N + 1;
        } else if (N % 4 <= 2) {
            return N + 2;
        } else {
            return N - 1;
        }
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().clumsy(10));
    }
}

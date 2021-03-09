package more_than_1001.P1047_删除字符串中的所有相邻重复项;

import java.util.LinkedList;

class Solution {
    public String removeDuplicates(String S) {
        LinkedList<Character> linkedList = new LinkedList<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (linkedList.isEmpty() || c != linkedList.getLast()){
                linkedList.addLast(c);
            }else{
                linkedList.removeLast();
            }
        }
        StringBuilder s = new StringBuilder();
        while (!linkedList.isEmpty()){
            s.append(linkedList.removeFirst());
        }
        return s.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().removeDuplicates("abbaca"));
    }
}

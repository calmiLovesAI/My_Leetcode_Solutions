package from_201_to_400.P331_验证二叉树的前序序列化;

import java.util.Arrays;
import java.util.LinkedList;

class Solution1 {
    public boolean isValidSerialization(String preorder) {
        if (preorder.isEmpty()) return false;
        int n = preorder.length();
        LinkedList<Boolean> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (preorder.charAt(i) == '#') {
                if (linkedList.isEmpty()) {
                    return i == n - 1;
                } else {
                    linkedList.remove();
                    i++;
                }
            } else {
                while (i < n && preorder.charAt(i) != ',') {
                    i++;
                }
                linkedList.add(true);
            }
        }
        return false;
    }
}


/*
把有效的叶子节点使用 "#" 代替。**比如把 4## 替换成 # 。此时，非叶子节点会变成叶子节点
 */

class Solution2 {
    public boolean isValidSerialization(String preorder) {
        LinkedList<String> linkedList = new LinkedList();
        String[] arr = preorder.split(",");
        for (String s : arr) {
            linkedList.add(s);
            while (linkedList.size() >= 3 && linkedList.get(linkedList.size() - 1).equals("#") && linkedList.get(linkedList.size() - 2).equals("#") && !linkedList.get(linkedList.size() - 3).equals("#")) {
                linkedList.removeLast();
                linkedList.removeLast();
                linkedList.removeLast();
                linkedList.add("#");
            }
        }
        return linkedList.size() == 1 && linkedList.remove().equals("#");
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution2().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#"));
    }
}

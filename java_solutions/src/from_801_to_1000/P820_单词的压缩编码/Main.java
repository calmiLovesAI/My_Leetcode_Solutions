package from_801_to_1000.P820_单词的压缩编码;

import java.util.HashMap;

class TrieNode {
    public TrieNode[] children;
    public int count;

    public TrieNode() {
        children = new TrieNode[26];
        count = 0;
    }

    public TrieNode get(char c) {
        int u = c - 'a';
        if (children[u] == null) {
            children[u] = new TrieNode();
            count++;
        }
        return children[u];
    }
}


class Solution {
    public int minimumLengthEncoding(String[] words) {
        TrieNode trie = new TrieNode();
        HashMap<TrieNode, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            TrieNode cur = trie;
            for (int j = word.length() - 1; j >= 0; j--) {
                cur = cur.get(word.charAt(j));
            }
            hashMap.put(cur, i);  // 记录每个单词的叶子节点与单词编号的对应关系
        }

        int ans = 0;
        for (TrieNode node : hashMap.keySet()) {
            if (node.count == 0) {
                ans += words[hashMap.get(node)].length() + 1;
            }
        }

        return ans;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("");
    }
}

package from_201_to_400.P208_实现Trie;

import java.util.Arrays;

class TrieNode{
    public boolean isEnd;
    public TrieNode[] next;

    public TrieNode() {
        this.isEnd = false;
        this.next = new TrieNode[26];
        Arrays.fill(this.next, null);
    }
}


class Trie {

    private final TrieNode root;

    /** Initialize your data structure here. */
    public Trie() {
        this.root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode p = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int u = c - 'a';
            if (p.next[u] == null){
                p.next[u] = new TrieNode();
            }
            p = p.next[u];
        }
        p.isEnd = true;
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode p = this.root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int u = c - 'a';
            if (p.next[u] == null){
                return false;
            }
            p = p.next[u];
        }
        return p.isEnd;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode p = this.root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            int u = c - 'a';
            if (p.next[u] == null){
                return false;
            }
            p = p.next[u];
        }
        return true;
    }
}



public class Main {
    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        boolean param_1 = obj.search("apple");
        boolean param_2 = obj.search("app");
        boolean param_3 = obj.startsWith("app");
        System.out.println(param_1 + " " + param_2 + " " + param_3);
    }
}

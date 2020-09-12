# https://leetcode-cn.com/problems/implement-trie-prefix-tree/


class Node:
    def __init__(self):
        self.is_end = False
        self.next = [None] * 26


class Trie:

    def __init__(self):
        """
        Initialize your data structure here.
        """
        self.root = Node()


    def insert(self, word: str) -> None:
        """
        Inserts a word into the trie.
        """
        p = self.root
        for c in word:
            u = ord(c)-ord('a')
            if not p.next[u]:
                p.next[u] = Node()
            p = p.next[u]
        p.is_end = True


    def search(self, word: str) -> bool:
        """
        Returns if the word is in the trie.
        """
        p = self.root
        for c in word:
            u = ord(c)-ord('a')
            if not p.next[u]:
                return False
            p = p.next[u]
        return p.is_end

    def startsWith(self, prefix: str) -> bool:
        """
        Returns if there is any word in the trie that starts with the given prefix.
        """
        p = self.root
        # print(self.root.next)
        for c in prefix:
            u = ord(c)-ord('a')
            if not p.next[u]:
                return False
            p = p.next[u]
        return True



# Your Trie object will be instantiated and called as such:
# obj = Trie()
# obj.insert(word)
# param_2 = obj.search(word)
# param_3 = obj.startsWith(prefix)


if __name__ == '__main__':
    obj = Trie()
    obj.insert("apple")
    print(obj.search("apple"))
    print(obj.startsWith("app"))
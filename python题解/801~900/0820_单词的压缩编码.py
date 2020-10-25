from functools import reduce
from typing import List
from collections import defaultdict

# 方法一：判断给出的单词中是否有某个单词A是另外一个单词B的后缀，
# 如果有，则删除A，最后剩余的就是我们得到的压缩编码中的单词
class Solution1:
    def minimumLengthEncoding(self, words: List[str]) -> int:
        ans = set(words)
        for word in words:
            for i in range(1, len(word)):
                ans.discard(word[i:])

        return sum([len(word) + 1 for word in ans])


# 方法二：后缀树（将字符串反转后插入到字典树（前缀树）中）
class Solution2:
    def minimumLengthEncoding(self, words: List[str]) -> int:
        words = list(set(words))   # 去重
        # Trie is a nested dictionary with nodes created
        # when fetched entries are missing
        Trie = lambda : defaultdict(Trie)
        trie = Trie()

        # reduce(..., S, trie) is trie[S[0]][S[1]][S[2]][...][S[S.length - 1]]
        nodes = [reduce(dict.__getitem__, word[::-1], trie) for word in words]

        # Add word to the answer if it's node has no neighbors
        return sum(len(word) + 1
                   for i, word in enumerate(words)
                   if len(nodes[i]) == 0)

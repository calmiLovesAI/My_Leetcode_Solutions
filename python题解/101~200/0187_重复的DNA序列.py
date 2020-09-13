# https://leetcode-cn.com/problems/repeated-dna-sequences/

from typing import List
from collections import defaultdict


class Solution:
    def findRepeatedDnaSequences(self, s: str) -> List[str]:
        n = len(s)
        res = set()
        table = defaultdict(int)
        i = 0
        j = i + 9
        while j < n:
            sub_str = s[i:j+1]
            table[sub_str] += 1
            if table[sub_str] > 1:
                res.add(sub_str)

            i += 1
            j = i + 9

        return list(res)





if __name__ == '__main__':
    print(Solution().findRepeatedDnaSequences(s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"))
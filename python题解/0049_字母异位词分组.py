# https://leetcode-cn.com/problems/group-anagrams/


from typing import List
from collections import defaultdict


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hash_table = defaultdict(list)
        for s in strs:
            hash_table["".join(sorted(s))].append(s)

        res = []
        for k, v in hash_table.items():
            res.append(hash_table[k])
        return res


if __name__ == '__main__':
    print(Solution().groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
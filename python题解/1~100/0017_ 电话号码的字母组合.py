# https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/


from typing import List


class Solution:
    def __init__(self):
        self.chars = ["abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"]

    def letterCombinations(self, digits: str) -> List[str]:
        if not digits:
            return []
        res = [""]
        for d in digits:
            new_list = []
            for c in self.chars[int(d)-2]:
                for item in res:
                    new_list.append(item+c)
            res = new_list
        return res



if __name__ == '__main__':
    print(Solution().letterCombinations(digits="23"))
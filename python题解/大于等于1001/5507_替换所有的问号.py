# https://leetcode-cn.com/problems/replace-all-s-to-avoid-consecutive-repeating-characters/

class Solution:
    def __init__(self):
        self.letters = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n",
                   "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]

    def modifyString(self, s: str) -> str:
        n = len(s)
        s_list = list(s)
        for i in range(n):
            if s_list[i] == "?":
                k = 0
                while (i>= 1 and s_list[i-1] == self.letters[k]) or (i < n-1 and s_list[i+1] == self.letters[k]):
                    k += 1
                s_list[i] = self.letters[k]
        return "".join(s_list)


if __name__ == '__main__':
    print(Solution().modifyString(s="??yw?ipkj?"))
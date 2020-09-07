# https://leetcode-cn.com/problems/reverse-words-in-a-string/


class Solution:
    def reverseWords(self, s: str) -> str:
        s_list = s.strip().split(" ")
        s_list = list(filter(None, s_list))   # 过滤空字符串
        res = ""
        for item in s_list[::-1]:
            res += item
            res += " "
        return res.strip()


if __name__ == '__main__':
    print(Solution().reverseWords(s="a good   example"))
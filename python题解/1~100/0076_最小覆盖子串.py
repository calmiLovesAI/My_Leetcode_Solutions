# https://leetcode-cn.com/problems/minimum-window-substring/
from collections import defaultdict

import math

class Solution:
    def __init__(self):
        self.ori = defaultdict(int)
        self.cnt = defaultdict(int)
    
    # 检查滑动窗口中的字串是否包含所有的t中的字符
    def check(self):
        for k, v in self.ori.items():
            if self.cnt[k] < v:
                return False
        return True

    def minWindow(self, s: str, t: str) -> str:
        for c in t:
            self.ori[c] += 1
        # 双指针，子串首尾指针分别为l, r（即索引）
        l = 0
        r = -1

        # 记录满足条件的子串的长度和左边起始的索引
        sub_str_len = math.inf
        left_idx = -1
        while r < len(s)-1:
            # 向右移动r
            r += 1
            if s[r] in self.ori:
                self.cnt[s[r]] += 1

            # 满足条件后，向左移动l
            while self.check() and l <= r:
                if (r-l+1) < sub_str_len:
                    sub_str_len = r-l+1
                    left_idx = l
                # 在l向右移动的过程中，如果经过了t中的字符，则需要在cnt减去相应字符的value
                if s[l] in self.ori:
                    self.cnt[s[l]] -= 1
                l += 1
        
        return "" if left_idx == -1 else s[left_idx: left_idx + sub_str_len]


            





if __name__ == "__main__":
    print(Solution().minWindow(s="ADOBECODEBANC", t="ABC"))
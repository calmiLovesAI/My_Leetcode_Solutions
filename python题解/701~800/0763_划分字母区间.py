
from typing import List


class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        # 贪心 + 双指针
        # 首先构建一个字典，存储每个字符出现的第一个位置和最后一个位置
        d = dict()
        n = len(S)
        for i in range(n):
            c = S[i]
            if c not in d:
                d[c] = [i, i]
            else:
                d[c][1] = i
        # 维护start和end这两个指针
        start, end = 0, 0
        ans = []
        for i in range(n):
            c = S[i]
            end = max(end, d[c][1])
            if i == end:
                ans.append(end - start + 1)
                start = end + 1
        return ans




if __name__ == '__main__':
    print(Solution().partitionLabels(S = "ababcbacadefegdehijhklij"))
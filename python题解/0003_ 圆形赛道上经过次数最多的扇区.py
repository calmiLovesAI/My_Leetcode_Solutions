# https://leetcode-cn.com/problems/most-visited-sector-in-a-circular-track/

from typing import List


class Solution:
    def mostVisited(self, n: int, rounds: List[int]) -> List[int]:
        num_visit = [0 for i in range(n)]
        m = len(rounds) - 1
        for i in range(m):
            start = rounds[i]
            end = rounds[i+1]
            while start!=end:
                num_visit[start-1] += 1
                start += 1
                if start > n:
                    start = 1

        num_visit[rounds[-1] - 1] += 1

        res = []
        max_value = max(num_visit)
        for i in range(n):
            if num_visit[i] == max_value:
                res.append(i+1)
        return res



if __name__ == '__main__':
    print(Solution().mostVisited(4, [1, 3, 1, 2]))

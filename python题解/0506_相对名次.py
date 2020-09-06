# https://leetcode-cn.com/problems/relative-ranks/

from typing import List


class Solution:
    def findRelativeRanks(self, nums: List[int]) -> List[str]:
        # 将运动员的编号与成绩一一对应
        score_id = {}
        for i, score in enumerate(nums):
            score_id[score] = i
        nums_sorted = sorted(nums, reverse=True)

        res = ["" for _ in range(len(nums))]
        for j in range(len(nums_sorted)):
            if j == 0:
                res[score_id[nums_sorted[j]]] = "Gold Medal"
            elif j == 1:
                res[score_id[nums_sorted[j]]] = "Silver Medal"
            elif j == 2:
                res[score_id[nums_sorted[j]]] = "Bronze Medal"
            else:
                res[score_id[nums_sorted[j]]] = str(j + 1)

        return res



if __name__ == '__main__':
    print(Solution().findRelativeRanks(nums=[5, 4, 3, 2, 1]))
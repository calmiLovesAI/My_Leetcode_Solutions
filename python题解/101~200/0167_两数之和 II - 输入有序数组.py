from typing import List

# https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/submissions/


class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        n = len(numbers)
        # 双指针
        i, j = 0, n-1
        while i<j:
            t = numbers[i] + numbers[j]
            if t == target:
                return [i+1, j+1]
            elif t < target:
                i += 1
            else:
                j -= 1
        return [-1, -1]


if __name__ == "__main__":
    pass
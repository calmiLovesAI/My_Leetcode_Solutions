
from typing import List


class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        # 异或运算
        n = len(nums)
        temp = [x for x in range(0, n+1)]
        temp.extend(nums)
        ans = 0  # 0与任何数异或都是这个数本身
        for item in temp:
            ans = ans ^ item
        return ans


if __name__ == '__main__':
    print(Solution().missingNumber([9,6,4,2,3,5,7,0,1]))
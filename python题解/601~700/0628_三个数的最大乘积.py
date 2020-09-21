# https://leetcode-cn.com/problems/maximum-product-of-three-numbers/

from typing import List


class Solution:
    def maximumProduct(self, nums: List[int]) -> int:
        # 贪心，两种可能情况，最大的3个数或者最大的一个数和两个最小的数
        nums.sort()
        return max(nums[-1]*nums[-2]*nums[-3], nums[-1]*nums[0]*nums[1])


if __name__ == '__main__':
    print(Solution().maximumProduct([1, 2, 3, 4]))
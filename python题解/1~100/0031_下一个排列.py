from typing import List


class Solution:
    def nextPermutation(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        if n <= 1:
            return
        i, j, k = n-2, n-1, n-1
        # 从后向前查找第一个相邻升序的元素对 (i,j)，满足 A[i] < A[j]。此时 [j,end) 必然是降序
        while i >= 0 and nums[i] >= nums[j]:
            i -= 1
            j -= 1
        if i >= 0:
            # 在 [j,end) 从后向前查找第一个满足 A[i] < A[k] 的 k。A[i]、A[k] 分别就是上文所说的「小数」、「大数」
            while nums[i] >= nums[k]:
                k -= 1
            # 将 A[i] 与 A[k] 交换
            nums[i], nums[k] = nums[k], nums[i]
        # 可以断定这时 [j,end) 必然是降序，逆置 [j,end)，使其升序

        p = j
        q = n-1
        while p < q:
            nums[p], nums[q] = nums[q], nums[p]
            p += 1
            q -= 1

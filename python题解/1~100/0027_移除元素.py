

from typing import List


class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        n = len(nums)
        if n == 1 and nums[0] == val:
            return 0
        # 双指针
        i = 0
        j = n - 1
        while i < j:
            while i < n and nums[i] != val:
                i += 1
            while j >= 0 and nums[j] == val:
                j -= 1
            if i < j:
                nums[i], nums[j] = nums[j], nums[i]
            elif i == j:
                return i + 1
            else:
                if i == 0:
                    return 0
                if j == n - 1:
                    return n
            # i += 1
            # j -= 1
        return i + 1




if __name__ == '__main__':
    print(Solution().removeElement(nums=[3, 2], val=3))
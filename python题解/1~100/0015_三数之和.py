# https://leetcode-cn.com/problems/3sum/

from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        n = len(nums)
        nums.sort()
        for k in range(n):
            if k > 0 and nums[k] == nums[k-1]:
                continue
            j = n-1

            for i in range(k+1, n):
                if i > k+1 and nums[i] == nums[i-1]:
                    continue
                while i < j  and nums[k] + nums[i] + nums[j] > 0:
                    j -= 1
                if i == j:
                    break
                if nums[k] + nums[i] + nums[j] == 0:
                    ans.append([nums[k], nums[i], nums[j]])

        return ans




if __name__ == '__main__':
    print(Solution().threeSum([-1,0,1,2,-1,-4]))
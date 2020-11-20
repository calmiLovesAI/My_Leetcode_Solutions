from typing import List
from copy import deepcopy


class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        ans = deepcopy(nums)
        nums.sort()
        d = dict()
        for i in range(len(nums)):
            if nums[i] not in d:
                d[nums[i]] = i
        print(d)
        for j in range(len(ans)):
            ans[j] = d[ans[j]]
        return ans


if __name__ == '__main__':
    print(Solution().smallerNumbersThanCurrent(nums = [8,1,2,2,3]))
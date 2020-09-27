
from typing import List



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # 将这个乘积分解为左侧全部元素乘积与右边全部元素乘积之积
        n = len(nums)
        L = [0 for _ in range(n)]
        R = [0 for _ in range(n)]

        for i in range(1, n):
            if i > 1:
                L[i] = L[i-1] * nums[i-1]
            else:
                L[i] = nums[0]

        for j in range(n-2, -1, -1):
            if j < n-2:
                R[j] = R[j+1] * nums[j+1]
            else:
                R[j] = nums[n-1]

        ans = [0 for _ in range(n)]
        for k in range(n):
            if k == 0:
                ans[k] = R[0]
            elif k == n-1:
                ans[k] = L[n-1]
            else:
                ans[k] = L[k] * R[k]
        return ans



if __name__ == '__main__':
    print(Solution().productExceptSelf(nums=[1,2,3,4]))
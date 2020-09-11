# https://leetcode-cn.com/problems/kth-smallest-number-in-multiplication-table/

import math

class Solution:
    def findKthNumber(self, m: int, n: int, k: int) -> int:
        # 二分查找
        l, r = 1, m*n

        while l < r:
            mid = math.floor((l+r)/2)
            cnt = 0
            for i in range(1, m+1):
                cnt += min(mid//i, n)
            if cnt >= k:
                r = mid
            else:
                l = mid + 1
        return l



if __name__ == '__main__':
    print(Solution().findKthNumber(m=45, n=12, k=471))
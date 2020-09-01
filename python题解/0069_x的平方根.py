import math

class Solution:

    def mySqrt(self, x: int) -> int:
        l, r = 0, x
        ans = -1
        while l <= r:
            mid = (l + r) // 2
            if mid**2 <= x:
                l = mid + 1
                ans = mid
            else:
                r = mid - 1
        return ans

        


if __name__ == "__main__":
    print(Solution().mySqrt(2))
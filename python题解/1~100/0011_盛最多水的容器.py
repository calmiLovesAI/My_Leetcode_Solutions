

from typing import List


# 双指针
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        i = 0
        j = n - 1
        area = min(height[j], height[i]) * (j - i)   # 初始化

        while i < j:
            # 固定长边，移动短边
            if height[i] < height[j]:
                i += 1
                area = max(area, min(height[j], height[i]) * (j - i))
            else:
                j -= 1
                area = max(area, min(height[j], height[i]) * (j - i))


        return area


if __name__ == '__main__':
    print(Solution().maxArea([2,3,10,5,7,8,9]))
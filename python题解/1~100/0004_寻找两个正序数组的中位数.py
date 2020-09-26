
from typing import List
import math


# 第一种方法，时间复杂度为O(m+n)，空间复杂度为O(m+n)
class Solution1:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        m, n = len(nums1), len(nums2)
        t = []
        i = j = 0
        while i<m and j<n:
            if nums1[i] < nums2[j]:
                t.append(nums1[i])
                i += 1
            else:
                t.append(nums2[j])
                j += 1

        while i<m:
            t.append(nums1[i])
            i += 1

        while j<n:
            t.append(nums2[j])
            j += 1

        if (m+n)%2 == 0:
            return (t[int((m+n)/2 - 1)] + t[int((m+n)/2)])/2
        else:
            return t[math.floor((m+n)/2)]



# 第二种，使用二分查找，时间复杂度O(log(min(m, n)))，空间复杂度O(1)

class Solution2:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        # 保证nums1的元素数量比nums2少
        if len(nums2) < len(nums1):
            nums1, nums2 = nums2, nums1
        m = len(nums1)
        n = len(nums2)

        # 分割线左边元素之和
        total_left = math.floor((m+n+1)/2)
        # 在nums1的区间[0, m]找分割线，满足nums1[i-1]<=nums2[j] and nums2[j-1]<=nums1[i]

        # 分割线位于i-1和i之间，j-1和j之间
        left = 0
        right = m

        while left < right:
            i = left + math.floor((right-left)/2)
            j = total_left - i
            if nums2[j-1] > nums1[i]:
                # (i+1, right)
                left = i+1
            else:
                # (left, i)
                right = i

        i = left
        j = total_left - i


        nums1_left_max = -math.inf if i==0 else nums1[i-1]
        nums1_right_min = math.inf if i==m else nums1[i]
        nums2_left_max = -math.inf if j==0 else nums2[j-1]
        nums2_right_min = math.inf if j==n else nums2[j]


        if (m+n)%2 == 0:
            ans = (max(nums1_left_max, nums2_left_max) + min(nums1_right_min, nums2_right_min))/2
            return float(ans)
        else:
            ans = max(nums1_left_max, nums2_left_max)
            return float(ans)





if __name__ == '__main__':
    print(Solution2().findMedianSortedArrays(nums1 = [1, 2], nums2 = [3, 4]))
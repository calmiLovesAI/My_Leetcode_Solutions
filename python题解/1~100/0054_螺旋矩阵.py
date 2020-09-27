from typing import List
import math


class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        res = []
        while matrix:
            res += matrix.pop(0)
            matrix = list(zip(*matrix))[::-1]
        return res
        # if not matrix or not matrix[0]:
        #     return []
        # m = len(matrix)
        # n = len(matrix[0])
        # ans = []
        #
        # num_loop = math.ceil(m/2)
        #
        # left = [0, 0]
        # right = [m-1, n-1]
        # print(left, right, num_loop)
        #
        # for k in range(num_loop):
        #     i = j = k
        #     if left[0] == right[0] and left[1] == right[1]:
        #         ans.append(matrix[i][j])
        #     elif left[0] == right[0]:
        #         while j <= right[1]:
        #             ans.append(matrix[i][j])
        #             j += 1
        #     elif left[1] == right[1]:
        #         while i <= right[0]:
        #             ans.append(matrix[i][j])
        #             i += 1
        #     else:
        #         while j < right[1]:
        #             ans.append(matrix[i][j])
        #             j += 1
        #         while i < right[0]:
        #             ans.append(matrix[i][j])
        #             i += 1
        #         while j > left[1]:
        #             ans.append(matrix[i][j])
        #             j -= 1
        #         while i > left[0]:
        #             ans.append(matrix[i][j])
        #             i -= 1
        #
        #         left[0] += 1
        #         left[1] += 1
        #         right[0] -= 1
        #         right[1] -= 1
        #
        # return ans



if __name__ == '__main__':
    print(Solution().spiralOrder(matrix=[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]))
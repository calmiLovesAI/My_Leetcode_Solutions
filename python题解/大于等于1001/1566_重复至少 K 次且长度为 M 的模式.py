from typing import List


class Solution:
    def containsPattern(self, arr: List[int], m: int, k: int) -> bool:
        n = len(arr)
        i = 0
        while i+m*k<=n:
            pattern = arr[i:i+m]
            # pattern * k 会将列表的切片复制k份
            if pattern * k == arr[i:i+m*k]:
                return True
            i += 1
        return False


if __name__ == "__main__":
    print(Solution().containsPattern(arr=[1,2,1,2,1,1,1,3], m=2, k=2))
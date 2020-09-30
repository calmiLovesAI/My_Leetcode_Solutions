from typing import List


class Solution:
    def lastStoneWeightII(self, stones: List[int]) -> int:
        # 将这些数字分成两拨，使得他们的和的差最小
        t = sum(stones)/2
        candidates = {0}
        for x in stones:
            addition = set()
            for y in candidates:
                if x + y <= t:
                    addition.add(x+y)
            candidates = candidates.union(addition)
        return int(2*(t - max(candidates)))



if __name__ == '__main__':
    print(Solution().lastStoneWeightII([2,7,4,1,8,1]))

from typing import List



class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        if len(stones) == 1:
            return stones[0]

        while len(stones) >= 2:
            stones.sort(reverse=True)
            if stones[0] == stones[1]:
                stones.pop(0)
                stones.pop(0)
            else:
                stones[0] = stones[0] - stones[1]
                stones.pop(1)

        if len(stones) > 0:
            return stones[0]
        else:
            return 0



if __name__ == '__main__':
    print(Solution().lastStoneWeight([2,7,4,1,8,1]))
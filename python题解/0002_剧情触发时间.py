# https://leetcode-cn.com/problems/ju-qing-hong-fa-shi-jian/

from typing import List

class Solution:
    def getTriggerTime(self, increase: List[List[int]], requirements: List[List[int]]) -> List[int]:
        a = [0 for _ in range(3)]  # C=R=H=0
        # 将剧情下标存入requirements中
        requirements = [x + [i] for i, x in enumerate(requirements)]
        # 按照3个条件对requirements进行排序，得到3个列表
        s = [sorted(requirements, key=lambda x : x[i]) for i in range(3)]
        
        index = [0 for _ in range(3)]   # 当前剧情的索引，因为有3个属性条件，所以建立3个索引

        num_plot = len(requirements)
        trigger = [0 for _  in range(num_plot)]
        ans = [-1 for _ in range(num_plot)]
        for d, (C, R, H) in enumerate(increase):
           a[0] += C
           a[1] += R
           a[2] += H

           for i in range(3):
               # 遍历3个属性
               while index[i] < num_plot and a[i] >= s[i][index[i]][i]:
                   trigger[s[i][index[i]][-1]] += 1  # 记录某个剧情被触发了一次
                   if trigger[s[i][index[i]][-1]] == 3:
                       ans[s[i][index[i]][-1]] = d+1
                   index[i] += 1
            
        # 一开始就满足条件
        for (c, r, h, k) in requirements:
            if c == 0  and r == 0 and h == 0:
                ans[k] = 0
        return ans
                


if __name__ == "__main__":
    print(Solution().getTriggerTime(increase = [[2,8,4],[2,5,0],[10,9,8]], requirements=[[2,11,3],[15,10,7],[9,17,12],[8,1,14]]))
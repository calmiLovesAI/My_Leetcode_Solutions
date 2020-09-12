# https://leetcode-cn.com/problems/base-7/




class Solution:
    def convertToBase7(self, num: int) -> str:
        flag = True
        if num < 0:
            flag = False
            num = 0 - num
        if num == 0:
            return "0"
        base_7_num = ""
        while num // 7:
            remainder = num % 7
            num = num // 7
            base_7_num += str(remainder)
        base_7_num += str(num % 7)
        base_7_num = "".join(reversed(base_7_num))
        if not flag:
            base_7_list = list(base_7_num)
            base_7_list.insert(0, "-")
            base_7_num = "".join(base_7_list)
        return base_7_num

if __name__ == '__main__':
    print(Solution().convertToBase7(num=100))



class Solution:
    def isLongPressedName(self, name: str, typed: str) -> bool:
        l1, l2 = len(name), len(typed)
        i, j = 0, 0
        while i < l1 and j < l2:
            # 计算重复元素的个数
            if name[i] != typed[j]:
                return False
            cnt_1 = 1
            cnt_2 = 1
            while i + 1 < l1 and name[i+1] == name[i]:
                cnt_1 += 1
                i += 1
            while j + 1 < l2 and typed[j + 1] == typed[j]:
                cnt_2 += 1
                j += 1
            if cnt_1 > cnt_2:
                return False
            i += 1
            j += 1
        if i == len(name) and j == len(typed):
            return True
        else:
            return False


if __name__ == '__main__':
    print(Solution().isLongPressedName("pyplrz", "ppyypllr"))
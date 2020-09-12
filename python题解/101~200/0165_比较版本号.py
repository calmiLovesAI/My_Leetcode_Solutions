# https://leetcode-cn.com/problems/compare-version-numbers/


class Solution:

    def compareVersion(self, version1: str, version2: str) -> int:
        list_1, list_2 = version1.split("."), version2.split(".")
        a, b = len(list_1), len(list_2)
        max_l = max(a, b)
        if a < max_l:
            list_1.extend(["0"]*(max_l-a))
        if b < max_l:
            list_2.extend(["0"]*(max_l-b))
        for i in range(max_l):
            if int(list_1[i]) == int(list_2[i]):
                i += 1
            elif int(list_1[i]) < int(list_2[i]):
                return -1
            else:
                return 1
        return 0




if __name__ == '__main__':
    print(Solution().compareVersion(version1="0.1", version2="1.1"))
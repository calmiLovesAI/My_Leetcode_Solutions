

class Solution:
    def addStrings(self, num1: str, num2: str) -> str:
        # 模拟竖式相加
        add = False   # 是否进位
        ans = []
        i = len(num1) - 1
        j = len(num2) - 1
        while i>=0 or j>=0:
            if i >= 0 and j >= 0:
                result = int(num1[i]) + int(num2[j])
            elif i >= 0:
                result = int(num1[i])
            else:
                result = int(num2[j])
            if add:
                result += 1
                add = False
            if result >= 10:
                add = True
                ans.insert(0, str(result-10))
            else:
                ans.insert(0, str(result))
            i -= 1
            j -= 1

        if add:
            ans.insert(0, "1")

        return "".join(ans)

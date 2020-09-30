

class Solution:
    def __init__(self):
        self.flag = True

    def validPalindrome(self, s: str) -> bool:
        # 双指针加递归
        n = len(s)
        i = 0
        j = n - 1
        while i < j:
            if s[i] != s[j]:
                if self.flag:
                    self.flag = False
                    return self.validPalindrome(s[i+1:j+1]) or self.validPalindrome(s[i:j])
                else:
                    return False
            i += 1
            j -= 1
        return True


if __name__ == '__main__':
    print(Solution().validPalindrome(s="abca"))
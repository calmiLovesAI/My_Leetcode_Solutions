# https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/


class Solution:
    def replaceSpace(self, s: str) -> str:
        return s.replace(" ", "%20")


if __name__ == '__main__':
    print(Solution().replaceSpace(s="We are happy."))
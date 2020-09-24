# https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/

from typing import List


class Solution:
    def __init__(self):
        self.board = []
        self.word = ""
        self.n = 0   # 行
        self.m = 0    # 列

    def dfs(self, i, j, k):
        # 当前元素在第i行第j列，需要寻找的字符是word[k]
        # 递归结束条件：
        # 首先这个位置不能超出边界
        if i >= self.n or j >= self.m or i < 0 or j < 0:
            return False
        # 然后k为最后一个索引时结束递归
        if k == len(self.word) - 1:
            return self.board[i][j] == self.word[k]
        # 最后这个位置处的元素不等于word[k]，那么递归结束
        if self.board[i][j] != self.word[k]:
            return False
        temp = self.board[i][j]
        self.board[i][j] = "*"

        # 递归搜索word[k+1]
        right = self.dfs(i, j+1, k+1)  # 右
        down = self.dfs(i+1, j, k+1)  # 下
        left = self.dfs(i, j-1, k+1)  # 左
        up = self.dfs(i-1, j, k+1)  # 上
        self.board[i][j] = temp
        return right or down or left or up

    def exist(self, board: List[List[str]], word: str) -> bool:
        # DFS + 剪枝
        if not board or not board[0]:
            return False
        self.board = board
        self.word = word
        # 起始点可以为board中的任意点
        self.n = len(self.board)
        self.m = len(self.board[0])
        for i in range(self.n):
            for j in range(self.m):
                if (self.word[0] == self.board[i][j]) and self.dfs(i, j, 0):
                    return True
        return False




if __name__ == '__main__':
    print(Solution().exist(board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"))
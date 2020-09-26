# https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/



class Solution:
    def __init__(self):
        self.m = 0
        self.n = 0
        self.k = 0
        self.visited = []
        self.ans = 0

    def sum_of_digits(self, num):
        return sum(list(map(int, list(str(num)))))

    def dfs(self, i, j):
        if not 0<=i<=self.m-1 or not 0<=j<=self.n-1:
            return
        if self.sum_of_digits(i) + self.sum_of_digits(j) > self.k:
            return
        if not self.visited[i][j]:
            self.ans += 1
            self.visited[i][j] = True

            self.dfs(i, j+1)
            self.dfs(i, j-1)
            self.dfs(i-1, j)
            self.dfs(i+1, j)
        else:
            return



    def movingCount(self, m: int, n: int, k: int) -> int:
        self.m = m
        self.n = n
        self.k = k
        self.visited = [[False for _ in range(n)] for _ in range(m)]
        self.dfs(0, 0)
        return self.ans



if __name__ == '__main__':
    print(Solution().movingCount(m = 2, n = 3, k = 1))
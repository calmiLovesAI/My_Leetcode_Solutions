# https://leetcode-cn.com/problems/min-stack/

from collections import deque


class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stk = deque()
        # 另外定义一个栈，存当前栈中所有元素的最小值
        self.stk_min = deque()

    def push(self, x: int) -> None:
        self.stk.append(x)
        if len(self.stk_min) == 0:
            self.stk_min.append(x)
        else:
            self.stk_min.append(min(x, self.stk_min[-1]))

    def pop(self) -> None:
        self.stk.pop()
        self.stk_min.pop()

    def top(self) -> int:
        return self.stk[-1]

    def getMin(self) -> int:
        return self.stk_min[-1]


if __name__ == "__main__":
    minStack = MinStack()
    minStack.push(-2)
    minStack.push(0)
    minStack.push(-3)
    print(minStack.getMin())
    minStack.pop()
    print(minStack.top())
    print(minStack.getMin())

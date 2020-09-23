# https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/

from collections import deque


class CQueue:

    def __init__(self):
        self.stk_1 = deque()
        self.stk_2 = deque()

    def appendTail(self, value: int) -> None:
        self.stk_1.append(value)

    def deleteHead(self) -> int:
        if not self.stk_2:
            while self.stk_1:
                self.stk_2.append(self.stk_1.pop())

        if not self.stk_2:
            return -1
        else:
            return self.stk_2.pop()


# Your CQueue object will be instantiated and called as such:
# obj = CQueue()
# obj.appendTail(value)
# param_2 = obj.deleteHead()


if __name__ == '__main__':
    obj = CQueue()
    obj.appendTail(3)
    print(obj.deleteHead())
    print(obj.deleteHead())
    print(obj.deleteHead())
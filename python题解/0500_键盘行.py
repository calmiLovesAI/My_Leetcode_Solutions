# https://leetcode-cn.com/problems/keyboard-row/

from typing import List


class Solution:
    def __init__(self):
        self.q_line = ["Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"]
        self.a_line = ["A", "S", "D", "F", "G", "H", "J", "K", "L"]
        self.z_line = []

    def checkWords(self, word):
        word = word.upper()
        if word[0] in self.q_line:
            first_word_line = self.q_line
        elif word[0] in self.a_line:
            first_word_line = self.a_line
        else:
            first_word_line = self.z_line
        for c in word:
            if c in self.q_line:
                other_word_line = self.q_line
            elif c in self.a_line:
                other_word_line = self.a_line
            else:
                other_word_line = self.z_line
            if other_word_line != first_word_line:
                return False
        return True

    def findWords(self, words: List[str]) -> List[str]:
        res = []
        for word in words:
            if self.checkWords(word):
                res.append(word)

        return res




if __name__ == '__main__':
    print(Solution().findWords(["Hello", "Alaska", "Dad", "Peace"]))
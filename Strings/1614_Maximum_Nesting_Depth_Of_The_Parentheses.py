"""
1614. Maximum Nesting Depth of the Parentheses

Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses.

Example 1: Input: s = "(1+(2*3)+((8)/4))+1" Output: 3
Explanation: Digit 8 is inside of 3 nested parentheses in the string.

Difficulty : Easy


"""

class Solution:
    def maxDepth(self, s: str) -> int:
        depth = 0
        max_depth = 0

        for i in range(len(s)):

            if s[i] == '(':
                depth += 1

                max_depth = max(max_depth, depth)

            elif s[i] == ')':
                depth -= 1

        return max_depth
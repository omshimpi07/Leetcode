"""
925. Long Pressed Name

Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Example 1: Input: name = "alex", typed = "aaleex" Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2: Input: name = "saeed", typed = "ssaaedd"
Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.

Difficulty : Easy
"""

class Solution:
    def isLongPressedName(self, name: str, typed: str) -> bool:
        left = 0
        right = 0

        while right < len(typed):

            if left < len(name) and name[left] == typed[right]:

                right += 1
                left += 1

            elif right > 0 and typed[right] == typed[right - 1]:

                right += 1

            else:
                return False

        return left == len(name)

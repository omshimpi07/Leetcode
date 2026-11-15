"""
2278. Percentage of Letter in String
Given a string s and a character letter, return the percentage of characters in s that equal letter rounded down to the nearest whole percent.

Example 1: Input: s = "foobar", letter = "o" Output: 33
Explanation: The percentage of characters in s that equal the letter 'o' is 2 / 6 * 100% = 33% when rounded down, so we return 33.

Difficulty : Easy

"""

class Solution:
    def percentageLetter(self, s: str, letter: str) -> int:
        count = 0

        for i in range(len(s)):

            if s[i] == letter:
                count += 1

        ans = 0

        if count == 0:
            return 0
        else:
            ans = (count * 100) // len(s)

        return ans
"""
2124. Check if All A's Appears Before All B's

Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

Example 1:Input: s = "aaabbb" Output: true
Explanation:The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.

Example 2: Input: s = "abab" Output: false
Explanation:There is an 'a' at index 2 and a 'b' at index 1.
Hence, not every 'a' appears before every 'b' and we return false.

Difficulty : Easy
"""

class Solution:
    def checkString(self, s: str) -> bool:
        # index = len(s)

        # for i in range(len(s)):

        #     if s[i] == 'b':
        #         index = i
        #         break

        # for j in range(index, len(s)):

        #     if s[j] == 'a':
        #         return False

        # return True

        seen_b = False

        for i in range(len(s)):

            if s[i] == 'b':
                seen_b = True

            elif seen_b:
                return False

        return True
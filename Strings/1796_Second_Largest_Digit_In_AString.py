"""
1796. Second Largest Digit in a String

Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1: Input: s = "dfa12321afd" Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.
Example 2: Input: s = "abc1111" Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
 
Difficulty : Easy

"""

class Solution:
    def secondHighest(self, s: str) -> int:
        # digits = []

        # for i in range(len(s)):

        #     ch = s[i]

        #     if '0' <= ch <= '9':
        #         digits.append(int(ch))

        # digits.sort()

        # if len(digits) < 2:
        #     return -1

        # largest = digits[len(digits) - 1]

        # for i in range(len(digits) - 2, -1, -1):

        #     if digits[i] != largest:
        #         return digits[i]

        # return -1

        # largest = -1

        # for i in range(len(s)):

        #     ch = s[i]

        #     if '0' <= ch <= '9':

        #         digit = int(ch)

        #         if digit > largest:
        #             largest = digit

        # second = -1

        # for i in range(len(s)):

        #     ch = s[i]

        #     if '0' <= ch <= '9':

        #         digit = int(ch)

        #         if digit < largest and digit > second:
        #             second = digit

        # return second

        largest = -1
        second = -1

        for i in range(len(s)):

            ch = s[i]

            if '0' <= ch <= '9':

                digit = int(ch)

                if digit > largest:
                    second = largest
                    largest = digit

                elif digit < largest and digit > second:
                    second = digit

        return second
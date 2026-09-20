"""3498. Reverse Degree of a String

Given a string s, calculate its reverse degree.
The reverse degree is calculated as follows:
For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
Sum these products for all characters in the string.
Return the reverse degree of s.

Example 1: Input: s = "abc" Output: 148
Explanation:
Letter	Index in Reversed Alphabet	Index in String	Product
'a'	26	1	26
'b'	25	2	50
'c'	24	3	72
The reversed degree is 26 + 50 + 72 = 148.

Difficulty : easy

Approach:
1. Initialize a variable ans to 0 to store the reverse degree.
2. Iterate through each character in the string s using its index j.
3. For each character, calculate its reverse value using the formula: reverse_value = ord('z') - ord(ch) + 1, where ch is the current character.
4. Multiply the reverse value by (j + 1) to account for the 1 -indexed position in the string.
5. Add the product to ans.

The final value of ans will be the reverse degree of the string s, which is returned at the end of the function.

Time Complexity: O(n), where n is the length of the string s, as we iterate through each character once.
Space Complexity: O(1), as we use a constant amount of extra space regardless of the input size.

"""

class Solution:
    def reverseDegree(self, s: str) -> int:
        # abc = [
        #     'a', 'b', 'c', 'd', 'e', 'f', 'g',
        #     'h', 'i', 'j', 'k', 'l', 'm',
        #     'n', 'o', 'p', 'q', 'r', 's',
        #     't', 'u', 'v', 'w', 'x', 'y', 'z'
        # ]

        # reverse = [0] * 26
        # minu = 71

        # for i in range(26):
        #     reverse[i] = ord(abc[i]) - minu
        #     minu += 2

        # ans = 0

        # for j in range(len(s)):

        #     for i in range(len(abc)):

        #         if s[j] == abc[i]:
        #             ans += reverse[i] * (j + 1)

        # return ans

        ans = 0

        for j in range(len(s)):

            ch = s[j]

            reverse_value = ord('z') - ord(ch) + 1

            ans += reverse_value * (j + 1)

        return ans
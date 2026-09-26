"""

917. Reverse Only Letters

Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1: Input: s = "ab-cd" Output: "dc-ba"

Difficulty: Easy

Appraoch: Two Pointers
1. Create a list of characters from the input string.
2. Initialize two pointers, left and right, at the beginning and end of the list, respectively.
3. While left is less than right:
   a. If the character at the left pointer is not an English letter, increment the left pointer.
   b. If the character at the right pointer is not an English letter, decrement the right pointer.
   c. If both characters are English letters, swap them and move both pointers towards the center.
4. Join the list of characters back into a string and return it.

Time Complexity: O(n), where n is the length of the input string. We traverse the string once to reverse the letters and once to construct the final result.
Space Complexity: O(n), where n is the length of the input string. We use additional space to store the reversed letters and the final result.

"""
class Solution:
    def reverseOnlyLetters(self, s: str) -> str:
        # arr = list(s)

        # left = 0
        # right = len(arr) - 1

        # while left < right:

        #     if not arr[left].isalpha():
        #         left += 1

        #     elif not arr[right].isalpha():
        #         right -= 1

        #     else:
        #         arr[left], arr[right] = arr[right], arr[left]

        #         left += 1
        #         right -= 1

        # return ''.join(arr)

        sb1 = []

        for i in range(len(s) - 1, -1, -1):
            c = s[i]

            if c.isalpha():
                sb1.append(c)

        reverse = ''.join(sb1)

        sb2 = []
        j = 0

        for i in range(len(s)):
            c = s[i]

            if c.isalpha():
                sb2.append(reverse[j])
                j += 1
            else:
                sb2.append(c)

        return ''.join(sb2)
    
"""

2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.
For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.

Example 1: Input: word = "abcdefd", ch = "d" Output: "dcbaefd"
Explanation: The first occurrence of "d" is at index 3. 
Reverse the part of word from 0 to 3 (inclusive), the resulting string is "dcbaefd".

Difficuty: Easy

Approach : Two Pointers
1. Find the index of the first occurrence of character ch in the string word. If ch is not found, return the original word.
2. Convert the string word into a list of characters to allow for in-place modifications.
3. Initialize two pointers, left and right, where left starts at 0 and right starts
    at the index of the first occurrence of ch.
4. While left is less than right, swap the characters at the left and right pointers, then increment left and decrement right.
5. After the loop, convert the list of characters back to a string and return it.

Time complexity of this approach is O(n), where n is the length of the input string word, since we are iterating through the string to find the index and then performing a reverse operation. The space complexity is O(n) due to the conversion of the string to a list for in-place modifications.
Space complexity is O(n) due to the conversion of the string to a list for in-place modifications.

"""


class Solution:
    def reversePrefix(self, word: str, ch: str) -> str:
        if word.find(ch) == -1:
            return word

        index = 0

        for i in range(len(word)):
            if word[i] == ch:
                index = i
                break

        arr = list(word)

        left = 0
        right = index

        while left < right:

            temp = arr[right]
            arr[right] = arr[left]
            arr[left] = temp

            left += 1
            right -= 1

        return "".join(arr)
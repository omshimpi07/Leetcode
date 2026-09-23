"""
2586. Count the Number of Vowel Strings in Range
You are given a 0-indexed array of string words and two integers left and right.
A string is called a vowel string if it starts with a vowel character and ends with a vowel character where vowel characters are 'a', 'e', 'i', 'o', and 'u'.
Return the number of vowel strings words[i] where i belongs to the inclusive range [left, right].

Example 1: Input: words = ["are","amy","u"], left = 0, right = 2 Output: 2
Explanation: 
- "are" is a vowel string because it starts with 'a' and ends with 'e'.
- "amy" is not a vowel string because it does not end with a vowel.
- "u" is a vowel string because it starts with 'u' and ends with 'u'.
The number of vowel strings in the mentioned range is 2.

Difficulty : easy

Approach:
1. Initialize a counter to zero.
2. Loop through the words from index left to right (inclusive).
3. For each word, check if the first and last characters are vowels.
4. If both are vowels, increment the counter.
5. Return the counter after the loop ends.

Time Complexity: O(n) where n is the number of words in the range [left, right].
Space Complexity: O(1) since we are using a constant amount of space for the counter and no additional data structures.

"""

class Solution:
    def vowelStrings(self, words: list[str], left: int, right: int) -> int:
    #     count = 0

    #     for i in range(left, right + 1):

    #         first = words[i][0]
    #         last = words[i][-1]

    #         if self.isVowel(first) and self.isVowel(last):
    #             count += 1

    #     return count

    # def isVowel(self, ch: str) -> bool:
    #     return (
    #         ch == 'a' or
    #         ch == 'e' or
    #         ch == 'i' or
    #         ch == 'o' or
    #         ch == 'u'
    #     )

        count = 0

        for i in range(left, right + 1):

            if (
                (
                    words[i][0] == 'a' or
                    words[i][0] == 'i' or
                    words[i][0] == 'o' or
                    words[i][0] == 'u' or
                    words[i][0] == 'e'
                )
                and
                (
                    words[i][-1] == 'a' or
                    words[i][-1] == 'i' or
                    words[i][-1] == 'o' or
                    words[i][-1] == 'u' or
                    words[i][-1] == 'e'
                )
            ):
                count += 1

        return count
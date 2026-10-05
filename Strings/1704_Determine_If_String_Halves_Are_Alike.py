"""

1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
Return true if a and b are alike. Otherwise, return false.

Example 1: Input: s = "book"Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.
Example 2: Input: s = "textbook" Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.

Diificulty : easy

Approach :
1. Split the string into two halves.
2. Count the number of vowels in each half.
3. Compare the counts and return true if they are equal, otherwise return false.
4.The isVowel function checks if a character is a vowel by checking if it is in the string "aeiouAEIOU".
5.The halvesAreAlike function iterates through the first half of the string and counts the number of vowels, then iterates through the second half and counts the number of vowels. Finally, it compares the two counts and returns true if they are equal, otherwise returns false.

The time complexity of this solution is O(n), where n is the length of the string s, since we are iterating through the string twice. The space complexity is O(1), since we are using a constant amount of space to store the counts of vowels.
Space complexity is O(1) because we are using a constant amount of space to store the counts of vowels.

"""


class Solution:
    def halvesAreAlike(self, s: str) -> bool:
    #     mid = len(s) // 2

    #     count_a = 0
    #     count_b = 0

    #     for i in range(mid):

    #         if self.isVowel(s[i]):
    #             count_a += 1

    #     for i in range(mid, len(s)):

    #         if self.isVowel(s[i]):
    #             count_b += 1

    #     return count_a == count_b

    # def isVowel(self, ch: str) -> bool:
    #     return (
    #         ch == 'a' or
    #         ch == 'e' or
    #         ch == 'i' or
    #         ch == 'o' or
    #         ch == 'u' or
    #         ch == 'A' or
    #         ch == 'E' or
    #         ch == 'I' or
    #         ch == 'O' or
    #         ch == 'U'
    #     )

        mid = len(s) // 2
        count = 0

        for i in range(mid):

            if self.isVowel(s[i]):
                count += 1

            if self.isVowel(s[i + mid]):
                count -= 1

        return count == 0

    def isVowel(self, ch: str) -> bool:
        return ch in "aeiouAEIOU"
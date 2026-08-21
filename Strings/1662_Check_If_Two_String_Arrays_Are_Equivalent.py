"""

1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true

Difficulty : easy

Approach : Two Pointer
1. Initialize two pointers i and j to 0, representing the current index in word1
2. Initialize two pointers p and q to 0, representing the current character index in the current word of word1 and word2 respectively.
3. While both i and j are within the bounds of word1 and word2:
4. Compare the characters word1[i][p] and word2[j][q].
5. If they are not equal, return false.
6. Increment p and q to move to the next character in the current words.
7. If p reaches the end of word1[i], increment i and reset p to 0 to move to the next word in word1.
8. If q reaches the end of word2[j], increment j and reset q to 0 to move to the next word in word2.
9. After the loop, check if both i and j have reached the end of their respective   arrays. If they have, return true; otherwise, return false.
Time Complexity : O(n + m) where n is the total number of characters in word1 and m is the total number of characters in word2.
Space Complexity : O(1) since we are using a constant amount of extra space.

"""
class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        #O(n**2) O(n)
        # str1 = ""
        # str2 = ""

        # for word in word1:
        #     str1 += word

        # for word in word2:
        #     str2 += word

        # return str1 == str2

        # Using joins O(n=m)
        # str1 = "".join(word1)
        # str2 = "".join(word2)

        # return str1 == str2

        #Most Optimized O(n + m) O(1)
        i = j = 0  # Word indexes
        p = q = 0  # Character indexes

        while i < len(word1) and j < len(word2):

            if word1[i][p] != word2[j][q]:
                return False

            p += 1
            q += 1

            # Move to next word in word1
            if p == len(word1[i]):
                i += 1
                p = 0

            # Move to next word in word2
            if q == len(word2[j]):
                j += 1
                q = 0

        return i == len(word1) and j == len(word2)

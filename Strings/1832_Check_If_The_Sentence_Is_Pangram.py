"""
1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1: Input: sentence = "thequickbrownfoxjumpsoverthelazydog" Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2: Input: sentence = "leetcode" Output: false

Difficulty : easy

Approach :
1. Create a set to store the unique characters in the sentence.
2. Iterate through each character in the sentence and add it to the set.
3. After processing all characters, check the size of the set. If it contains 26 unique characters, return true; otherwise, return false.
4. This approach has a time complexity of O(n), where n is the length of the sentence, and a space complexity of O(1) since the set can contain at most 26 characters.
5. The implementation of this approach is straightforward and can be done in a few lines of code.
The code below implements this approach in Python.
Time Complexity : O(n)
Space Complexity : O(1)

"""

class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        seen = set()

        for ch in sentence:
            seen.add(ch)

        return len(seen) == 26

        # freq = [0] * 26

        # for ch in sentence:
        #     index = ord(ch) - ord('a')
        #     freq[index] += 1

        # for i in range(26):
        #     if freq[i] == 0:
        #         return False

        # return True
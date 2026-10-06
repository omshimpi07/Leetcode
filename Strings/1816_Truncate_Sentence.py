"""
1816. Truncate Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1: Input: s = "Hello how are you Contestant", k = 4 Output: "Hello how are you"
Explanation: The words in s are ["Hello", "how", "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

Difficulty : Easy

Approach:
1. Split the sentence into words using the split() method.
2. Create an empty list to store the first k words.
3. Iterate through the first k words and append them to the result list.
4. Join the words in the result list with a space and return the resulting string.

Time Complexity: O(n), where n is the number of words in the sentence.
Space Complexity: O(n), where n is the number of words in the sentence.

"""

class Solution:
    def truncateSentence(self, s: str, k: int) -> str:
        parts = s.split(" ")
        result = []

        for i in range(k):
            result.append(parts[i])

            if i < k - 1:
                result.append(" ")

        return "".join(result)
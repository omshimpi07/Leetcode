"""
2185. Counting Words With a Given Prefix

You are given an array of strings words and a string pref.
Return the number of strings in words that contain pref as a prefix.
A prefix of a string s is any leading contiguous substring of s.

Example 1: Input: words = ["pay","attention","practice","attend"], pref = "at" Output: 2
Explanation: The 2 strings that contain "at" as a prefix are: "attention" and "attend".
Example 2: Input: words = ["leetcode","win","loops","success"], pref = "code" Output: 0
Explanation: There are no strings that contain "code" as a prefix.

Difficulty: Easy

Approach:
1. Initialize a counter to zero.
2. Iterate through each word in the words list.
3. For each word, check if it starts with the given prefix using the startswith()
4. If it does, increment the counter.
5. After checking all words, return the counter as the result.

Time Complexity: O(n * m), where n is the number of words and m is the average length of the words.
Space Complexity: O(1), as we are using a constant amount of space for the counter variable.

"""

class Solution:
    def prefixCount(self, words: list[str], pref: str) -> int:
        # count = 0

        # for i in range(len(words)):
        #     if words[i].startswith(pref):
        #         count += 1

        # return count

        count = 0

        for word in words:
            if word.startswith(pref):
                count += 1

        return count
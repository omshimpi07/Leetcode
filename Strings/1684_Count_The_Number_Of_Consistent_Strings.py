"""
1684. Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. A string
is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Example 1: Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"] Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Difficulty : easy
Approach : Set
1. Convert the string allowed into a set for O(1) lookups.
2. Initialize a counter to 0.
3. Iterate through each word in the words array:
4. For each word, check if all characters are in the allowed set using the all() function.
5. If the word is consistent, increment the counter.
6. Return the counter after checking all words.

Time Complexity : O(n * m) where n is the number of words and m is the average length of the words.
Space Complexity : O(k) where k is the number of distinct characters in allowed (at most 26 for lowercase English letters).

"""
class Solution:
    def countConsistentStrings(self, allowed, words):
        # allowed_set = set(allowed)

        # count = 0

        # for word in words:
        #     consistent = True

        #     for ch in word:
        #         if ch not in allowed_set:
        #             consistent = False
        #             break

        #     if consistent:
        #         count += 1

        # return count

        allowed_set = set(allowed)

        count = 0

        for word in words:
            if all(ch in allowed_set for ch in word):
                count += 1

        return count
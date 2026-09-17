"""
953. Verifying an Alien Dictionary
In an alien language, surprisingly they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, return
    true if and only if the given words are sorted lexicographically in this alien language.

Example 1: Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz" Output: true Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2: Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz" Output: false Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.

Difficulty : easy

Approach:
1. Create a dictionary to store the rank of each character in the alien language.
2. Iterate through the list of words and compare each word with the next one.
3. For each pair of words, compare their characters one by one until a difference is found or until the end of the shorter word is reached.
4. If a difference is found, check the ranks of the differing characters. If the character in the first word has a higher rank than the character in the second word, return False.
5. If no difference is found and the first word is longer than the second word, return False.
6. If all pairs of words are in the correct order, return True.

Time complexity of this approach is O(n * m), where n is the number of words and m is the average length of the words. The space complexity is O(1) since we are using a fixed-size dictionary to store the ranks of the characters
Space complexity is O(1) since we are using a fixed-size dictionary to store the ranks of the characters.

"""

class Solution:
    def isAlienSorted(self, words: list[str], order: str) -> bool:
        rank = {}

        for i in range(len(order)):
            rank[order[i]] = i

        for j in range(len(words) - 1):

            first = words[j]
            second = words[j + 1]

            min_length = min(len(first), len(second))
            different = False

            for i in range(min_length):

                if first[i] != second[i]:

                    different = True

                    if rank[first[i]] > rank[second[i]]:
                        return False

                    break

            if not different and len(first) > len(second):
                return False

        return True
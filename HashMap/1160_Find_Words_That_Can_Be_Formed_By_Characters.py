"""
1160. Find Words That Can Be Formed by Characters

You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).
Return the sum of lengths of all good strings in words.

Example 1: Input: words = ["cat","bt","hat","tree"], chars = "atach" Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Difficulty: Easy
"""
class Solution:
    def countCharacters(self, words: list[str], chars: str) -> int:
        freq_map = {}
        total = 0

        # Store available character frequencies
        for i in range(len(chars)):

            ch = chars[i]

            freq_map[ch] = freq_map.get(ch, 0) + 1

        # Check every word
        for word in words:

            temp = freq_map.copy()

            good = True

            for i in range(len(word)):

                ch = word[i]

                if temp.get(ch, 0) > 0:

                    temp[ch] = temp[ch] - 1

                else:
                    good = False
                    break

            if good:
                total += len(word)

        return total
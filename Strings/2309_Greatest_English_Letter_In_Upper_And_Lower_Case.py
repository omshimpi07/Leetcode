"""
2309. Greatest English Letter in Upper and Lower Case

Given a string of English letters s, return the greatest English letter which occurs as both a lowercase and uppercase letter in s. The returned letter should be in uppercase. If no such letter exists, return an empty string.
An English letter b is greater than another letter a if b appears after a in the English alphabet.

Example 1: Input: s = "lEeTcOdE" Output: "E"
Explanation: The letter 'E' is the only letter to appear in both lower and upper case.

Difficulty: Easy

"""

class Solution:
    def greatestLetter(self, s: str) -> str:
        # max_char = "\0"

        # for i in range(len(s)):

        #     ch = s[i]

        #     # Check whether character is uppercase
        #     if ch.isupper():

        #         # Convert uppercase to lowercase
        #         lower = ch.lower()

        #         if lower in s and ch > max_char:
        #             max_char = ch

        # return "" if max_char == "\0" else max_char

        upper = set()
        lower = set()

        for ch in s:

            if ch.isupper():
                upper.add(ch)

            elif ch.islower():
                lower.add(ch)

        for ch in reversed("ABCDEFGHIJKLMNOPQRSTUVWXYZ"):

            if ch in upper and ch.lower() in lower:
                return ch

        return ""
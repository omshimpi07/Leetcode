"""

1935.Maximum Number of Words You can type
There is malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

Example 1: Input: text = "hello world", brokenLetters = "ad" Output: 1 Explanation: We cannot type "world" because the 'd' key is broken. We can still type "hello" so the answer is 1.
Difficulty : easy


"""


class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        # broken = set(brokenLetters)

        # count = 0

        # for word in text.split():
        #     possible = True

        #     for ch in word:
        #         if ch in broken:
        #             possible = False
        #             break

        #     if possible:
        #         count += 1

        # return count

        count = 0

        for word in text.split():
            possible = True

            for ch in word:
                if ch in brokenLetters:
                    possible = False
                    break

            if possible:
                count += 1

        return count
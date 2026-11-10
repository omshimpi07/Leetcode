"""
2325. Decode the Message

You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.

Example 1: Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv" Output: "this is a secret"
Explanation: The diagram above shows the substitution table.
It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 
Difficulty: Easy

"""

class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        # mapping = [""] * 26
        # seen = set()

        # next_char_index = 0

        # # Build mapping
        # for ch in key:

        #     if ch == " ":
        #         continue

        #     if ch not in seen:
        #         seen.add(ch)

        #         index = ord(ch) - ord('a')

        #         mapping[index] = chr(ord('a') + next_char_index)

        #         next_char_index += 1

        # # Decode message
        # result = []

        # for ch in message:

        #     if ch == " ":
        #         result.append(" ")
        #     else:
        #         result.append(mapping[ord(ch) - ord('a')])

        # return "".join(result)

        # mapping = ["\0"] * 26
        # next_char_index = 0

        # # Build mapping
        # for ch in key:

        #     if ch == " ":
        #         continue

        #     index = ord(ch) - ord('a')

        #     if mapping[index] == "\0":

        #         mapping[index] = chr(ord('a') + next_char_index)

        #         next_char_index += 1

        # # Decode message
        # result = []

        # for ch in message:

        #     if ch == " ":
        #         result.append(" ")
        #     else:
        #         result.append(mapping[ord(ch) - ord('a')])

        # return "".join(result)

        mapping = {}

        next_char_index = 0

        # Build mapping
        for ch in key:

            if ch == " ":
                continue

            if ch not in mapping:

                mapping[ch] = chr(ord('a') + next_char_index)

                next_char_index += 1

        # Decode message
        result = []

        for ch in message:

            if ch == " ":
                result.append(" ")
            else:
                result.append(mapping[ch])

        return "".join(result)
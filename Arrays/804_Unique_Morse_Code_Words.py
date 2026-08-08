"""
804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:
For example, "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
Given an array of strings words where each word can be written as a concatenation of the Morse
code of each letter. For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-." (for "c"), ".-" (for "a"), and "-..." (for "b"). We will call such a concatenation the transformation of a word.

Return the number of different transformations among all words we have.

Difficulty : easy

Approach 
1. Create a list of Morse code representations for each letter of the alphabet.
2. For each word in the input list, convert it to its Morse code representation by concatenating the Morse codes of its characters.
3. Use a set to store unique Morse code representations.
4. Return the size of the set.
Time complexity : O(n * m) where n is the number of words and m is the average length of the words.
Space Complexity : O(k) where k is the number of unique Morse code representations.

"""

class Solution:
    def uniqueMorseRepresentations(self, words: list[str]) -> int:

        morse = [
            ".-","-...","-.-.","-..",".",
            "..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        ]

        seen = set()

        for word in words:

            result = []

            for ch in word:

                result.append(morse[ord(ch) - ord('a')])

            seen.add("".join(result))

        return len(seen)
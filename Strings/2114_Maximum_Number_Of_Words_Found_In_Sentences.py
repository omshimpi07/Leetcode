"""
2114. Maximum Number of Words Found in Sentences
You are given an array of strings sentences, where each sentences[i] represents a single sentence.

Each sentence consists of lowercase letters and spaces only, with no leading or trailing spaces. There is at least one word in each sentence.

Example 1:
Input: sentences = ["alice and bob love leetcode", "i think so too", "
this is great thanks very much"]
Output: 6

Difficulty: Easy

Approach:
1. Initialize a variable max_words to 0 to keep track of the maximum number of words
2. Iterate through each sentence in the sentences array
3. For each sentence, split the sentence into words using the split() method and count the number of words
4. Update max_words with the maximum of the current count and max_words
5. Return max_words after iterating through all sentences

Time Complexity: O(n * m), where n is the number of sentences and m is the average length of each sentence
Space Complexity: O(1), as we are using a constant amount of extra space

"""
class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        max_words = 0
        for sentence in sentences:
            count = len(sentence.split())
            max_words = max(count,max_words)
        return max_words

        # max_words = 0
        # for sentence in sentences:
        #     count = 1
        #     for ch in sentence:
        #         if ch == ' ':
        #             count += 1
        #     max_words = max(count,max_words)
        # return max_words
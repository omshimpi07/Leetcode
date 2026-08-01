/*
2114. Maximum Number of Words Found in Sentences
A sentence is a list of words that are separated by a single space with no leading or trailing spaces. You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.

Example 1: Input: sentences = ["alice and bob love leetcode", "i think so too", "this is great thanks very much"] Output: 6 Explanation:
The first sentence, "alice and bob love leetcode", has 5 words in total.
The second sentence, "i think so too", has 4 words in total.
The third sentence, "this is great thanks very much", has 6 words in total.
Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.

Example 2: Input: sentences = ["please wait", "continue to fight", "continue to win"] Output: 3 Explanation: It can be shown that all three sentences contain 3 words.

Difficulty : easy

Approach:
1. Initialize a variable max to keep track of the maximum number of words found in any sentence
2. Iterate through each sentence in the sentences array.
3. For each sentence, count the number of words by counting the number of spaces and adding 1 (since the number of words is one more than the number of spaces).
4. Update the max variable if the current sentence has more words than the current max.
5. After checking all sentences, return the max variable which contains the maximum number of words found in any sentence.

Time Complexity: O(n * m) where n is the number of sentences and m is the average length of the sentences, since we are iterating through each character in each sentence.
Space Complexity: O(1) since we are using a constant amount of extra space regardless of the input size.


*/

class Solution {
    public int mostWordsFound(String[] sentences) {
        
         
        int max = 0;

        for (int j = 0; j<sentences.length;j++) {

            int count = 1;

            for (int i = 0; i < sentences[j].length(); i++) {

                if (sentences[j].charAt(i) == ' ') {
                    count++;
                }
            }

            max = Math.max(max, count);
        }

        return max;
        // int max = 0;
        // for (int i = 0; i < sentences.length; i++) {

        //     String sentence = sentences[i];

        //     int count = sentence.split(" ").length;

        //     max = Math.max(max, count);
        // }
        // return max;


    }
}
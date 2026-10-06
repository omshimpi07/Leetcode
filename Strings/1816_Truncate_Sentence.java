/*
1816. Truncate Sentence

A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each of the words consists of only uppercase and lowercase English letters (no punctuation).
For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
You are given a sentence s​​​​​​ and an integer k​​​​​​. You want to truncate s​​​​​​ such that it contains only the first k​​​​​​ words. Return s​​​​​​ after truncating it.

Example 1: Input: s = "Hello how are you Contestant", k = 4 Output: "Hello how are you"
Explanation: The words in s are ["Hello", "how", "are", "you", "Contestant"].
The first 4 words are ["Hello", "how", "are", "you"].
Hence, you should return "Hello how are you".

Difficulty : Easy

Approach:
1. Split the input string into an array of words using space as a delimiter.
2. Use a StringBuilder to concatenate the first k words from the array, adding a space after each word except for the last one.
3. Return the resulting string from the StringBuilder.

Time Complexity: O(n) where n is the length of the input string, since we are iterating through the first k words.
Space Complexity: O(n) for the StringBuilder and the array of words, but

*/

class Solution {
    public String truncateSentence(String s, int k) {
        
        String[] parts = s.split(" ");
        StringBuilder sb1 = new StringBuilder();


        for(int i = 0; i < k ; i++){
            sb1.append(parts[i]);
            
            if (i < k - 1) {
                sb1.append(" ");
            }

            // sb1.append(parts[i] + " ");
        }
        // sb1.deleteCharAt(sb1.length() - 1);

        return sb1.toString();
        
    }
}
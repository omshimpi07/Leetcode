/*
1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.
Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1: Input: sentence = "thequickbrownfoxjumpsoverthelazydog" Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2: Input: sentence = "leetcode" Output: false

Difficulty : easy

Approach : Array.
1. Create an integer array of size 26 to keep track of the frequency of each letter in the sentence.
2. Iterate through each character in the sentence, and for each character, calculate its index (
0-25) by subtracting 'a' from the character. Increment the corresponding index in the frequency array.
3. After processing all characters, check if all indices in the frequency array are greater than
    zero. If any index is zero, it means that letter is missing from the sentence, and we return false. Otherwise, return true.

Time Complexity: O(n) where n is the length of the sentence, since we iterate through each character once.
Space Complexity: O(1) since the size of the frequency array is constant (26).

*/

class Solution {
    public boolean checkIfPangram(String sentence) {
        
        // boolean[] seen = new boolean[26];
        // for (int i = 0; i < sentence.length(); i++) {
        //     char ch = sentence.charAt(i);
        //     seen[ch - 'a'] = true;
        // }
        // for (int i = 0; i < 26; i++) {
        //     if (!seen[i]){
        //         return false;
        //     }
        // }

        // return true;
        int[] freq = new int[26];

        for(int i = 0; i < sentence.length(); i++){
            int index = sentence.charAt(i) - 'a';
            freq[index]++;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] == 0){
                return false;
            }
        }

        return true;
    }
}
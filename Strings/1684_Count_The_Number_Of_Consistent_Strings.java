/*
1684. Count the Number of Consistent Strings
You are given a string allowed consisting of distinct characters and an array of strings words. A string
is consistent if all characters in the string appear in the string allowed.
Return the number of consistent strings in the array words.

Example 1: Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"] Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.

Difficulty : easy

Approach : HashSet.
1. Create a HashSet to store the allowed characters for O(1) lookup.
2. Iterate through each word in the words array and check if all characters in the word are present in the allowed set.
3. If a word is consistent, increment the count.
4. Return the count of consistent strings after checking all words.

Time Complexity: O(n * m) where n is the number of words and m is the average length of the words, since we check each character of each word.
Space Complexity: O(k) where k is the number of distinct characters in the allowed string, for storing the allowed characters in the HashSet.

*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        //Contains version
        // int count = 0;
        // for (String word : words) {
        //     boolean consistent = true;
    
        //     for (int i = 0; i < word.length(); i++) {
        //         if (!allowed.contains(String.valueOf(word.charAt(i)))) {
        //             consistent = false;
        //             break;
        //         }
        //     }

        //     if (consistent) {
        //         count++;
        //     }
        // }

        //Hashset version
        // HashSet<Character> set = new HashSet<>();

        // for (char ch : allowed.toCharArray()) {
        //     set.add(ch);
        // }
        // int count = 0;

        // // Check every word
        // for (String word : words) {

        //     boolean consistent = true;

        //     for (int i = 0; i < word.length(); i++) {

        //         if (!set.contains(word.charAt(i))) {
        //             consistent = false;
        //             break;
        //         }
        //     }

        //     if (consistent) {
        //         count++;
        //     }
        // }

        //
         boolean[] allowedChars = new boolean[26];

        // Mark allowed characters
        for (int i = 0; i < allowed.length(); i++) {
            char ch = allowed.charAt(i);
            allowedChars[ch - 'a'] = true;
        }

        int count = 0;

        // Go through every word
        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            boolean consistent = true;

            // Go through every character of the word
            for (int j = 0; j < word.length(); j++) {

                char ch = word.charAt(j);

                if (!allowedChars[ch - 'a']) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}
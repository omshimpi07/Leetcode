/*
1935.Maximum Number of Words You can type
There is malfunctioning keyboard where some letter keys do not work. All other keys on the keyboard work properly.
Given a string text of words separated by a single space (no leading or trailing spaces) and a string brokenLetters of all distinct letter keys that are broken, return the number of words in text you can fully type using this keyboard.

Example 1: Input: text = "hello world", brokenLetters = "ad" Output: 1 Explanation: We cannot type "world" because the 'd' key is broken. We can still type "hello" so the answer is 1.
Difficulty : easy

Appraoch : HashSet.
1. Create a HashSet to store the broken letters for O(1) lookup.
2. Split the input text into words using space as the delimiter.
3. Initialize a count variable to keep track of the number of words that can be typed.
4. Iterate through each word in the words array:
   a. For each word, check if it contains any broken letters by iterating through its characters.
   b. If a broken letter is found, mark the word as untypeable and break the inner loop.
   c. If the word is typeable (no broken letters found), increment the count.
5. Return the count of typeable words after checking all words.

Time Complexity: O(n * m) where n is the number of words and m is the average length of the words, since we check each character of each word.
Space Complexity: O(k) where k is the number of distinct characters in the brokenLetters string, for storing the broken letters in the HashSet.


 */

class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        // String[] words = text.split(" ");

        // int count = 0;

        // for (int i = 0; i < words.length; i++) {

        //     boolean possible = true;

        //     for (int j = 0; j < words[i].length(); j++) {

        //         char ch = words[i].charAt(j);

        //         if (brokenLetters.contains(String.valueOf(ch))) {
        //             possible = false;
        //             break;
        //         }
        //     }

        //     if (possible) {
        //         count++;
        //     }
        // }

        // return count;

        // HashSet<Character> set = new HashSet<>();

        // // Store broken letters
        // for (int i = 0; i < brokenLetters.length(); i++) {
        //     set.add(brokenLetters.charAt(i));
        // }

        // String[] words = text.split(" ");

        // int count = 0;

        // for (int i = 0; i < words.length; i++) {

        //     boolean possible = true;

        //     for (int j = 0; j < words[i].length(); j++) {

        //         char ch = words[i].charAt(j);

        //         if (set.contains(ch)) {
        //             possible = false;
        //             break;
        //         }
        //     }

        //     if (possible) {
        //         count++;
        //     }
        // }

        // return count;


        boolean[] broken = new boolean[26];

        // Mark broken letters
        for (int i = 0; i < brokenLetters.length(); i++) {
            char ch = brokenLetters.charAt(i);
            broken[ch - 'a'] = true;
        }

        int count = 0;
        boolean possible = true;

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            // Word has ended
            if (ch == ' ') {

                if (possible) {
                    count++;
                }

                // Reset for the next word
                possible = true;
            }
            else if (broken[ch - 'a']) {
                possible = false;
            }
        }

        // Check the last word
        if (possible) {
            count++;
        }

        return count;
    }
}
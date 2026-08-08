/*
804. Unique Morse Code Words

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows:

For example, "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
Given an array of strings words where each word can be written as a concatenation of the Morse


code of each letter. For example, "cab" can be written as "-.-..--...", which is the concatenation of "-.-." (for "c"), ".-" (for "a"), and "-..." (for "b"). We will call such a concatenation the transformation of a word.

Return the number of different transformations among all words we have.

Difficulty : easy

Approach : HashSet.
1. Create an array of strings that contains the Morse code representation for each letter from 'a
2. Create a HashSet to store unique Morse code transformations.
3 .Iterate through each word in the input array.
4. For each word, create a StringBuilder to build its Morse code transformation.
5. For each character in the word, find its corresponding Morse code from the array and append it to the StringBuilder.
6. After processing the entire word, convert the StringBuilder to a string and add it to
the HashSet.

Time Complexity: O(n * m) where n is the number of words and m is the average length of the words, since we are iterating through each word and each character in the word.
Space Complexity: O(n * m) for the HashSet used to store unique Morse code transformations, where n is the number of words and m is the average length of the words.

*/
class Solution {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morse = {
            ".-","-...","-.-.","-..",".",
            "..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",
            ".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < words[i].length(); j++) {

                char ch = words[i].charAt(j);

                sb.append(morse[ch - 'a']);
            }

            set.add(sb.toString());
        }

        return set.size();
    }
}
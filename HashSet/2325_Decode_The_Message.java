/*
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

*/

class Solution {
    public String decodeMessage(String key, String message) {
        
        // char[] map = new char[26];
        // int next = 0;

        // // Build mapping
        // for (int i = 0; i < key.length(); i++) {

        //     char ch = key.charAt(i);

        //     if (ch == ' ') {
        //         continue;
        //     }

        //     boolean found = false;

        //     // Check whether character appeared before
        //     for (int j = 0; j < i; j++) {

        //         if (key.charAt(j) == ch) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         map[ch - 'a'] = (char) ('a' + next);
        //         next++;
        //     }
        // }

        // // Decode message
        // StringBuilder result = new StringBuilder();

        // for (char ch : message.toCharArray()) {

        //     if (ch == ' ') {
        //         result.append(' ');
        //     } else {
        //         result.append(map[ch - 'a']);
        //     }
        // }

        // return result.toString();

        // char[] map = new char[26];
        // HashSet<Character> seen = new HashSet<>();

        // int next = 0;

        // // Build mapping
        // for (char ch : key.toCharArray()) {

        //     if (ch == ' ') {
        //         continue;
        //     }

        //     if (seen.add(ch)) {
        //         map[ch - 'a'] = (char) ('a' + next);
        //         next++;
        //     }
        // }

        // // Decode message
        // StringBuilder result = new StringBuilder();

        // for (char ch : message.toCharArray()) {

        //     if (ch == ' ') {
        //         result.append(' ');
        //     } else {
        //         result.append(map[ch - 'a']);
        //     }
        // }

        // return result.toString();

        // char[] map = new char[26];
        // int next = 0;

        // // Build mapping
        // for (char ch : key.toCharArray()) {

        //     if (ch == ' ') {
        //         continue;
        //     }

        //     int index = ch - 'a';

        //     if (map[index] == '\0') {
        //         map[index] = (char) ('a' + next);
        //         next++;
        //     }
        // }

        // // Decode message
        // StringBuilder result = new StringBuilder();

        // for (char ch : message.toCharArray()) {

        //     if (ch == ' ') {
        //         result.append(' ');
        //     } else {
        //         result.append(map[ch - 'a']);
        //     }
        // }

        // return result.toString();

        HashMap<Character, Character> map = new HashMap<>();

        int next = 0;

        // Build mapping
        for (char ch : key.toCharArray()) {

            if (ch == ' ') {
                continue;
            }

            if (!map.containsKey(ch)) {
                map.put(ch, (char) ('a' + next));
                next++;
            }
        }

        // Decode message
        StringBuilder result = new StringBuilder();

        for (char ch : message.toCharArray()) {

            if (ch == ' ') {
                result.append(' ');
            } else {
                result.append(map.get(ch));
            }
        }

        return result.toString();


    }
}
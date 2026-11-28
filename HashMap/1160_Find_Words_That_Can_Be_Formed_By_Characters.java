/*
1160. Find Words That Can Be Formed by Characters

You are given an array of strings words and a string chars.
A string is good if it can be formed by characters from chars (each character can only be used once for each word in words).
Return the sum of lengths of all good strings in words.

Example 1: Input: words = ["cat","bt","hat","tree"], chars = "atach" Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.

Difficulty: Easy
*/

class Solution {
    public int countCharacters(String[] words, String chars) {
        
        // HashMap<Character, Integer> map = new HashMap<>();
        // int sum = 0;

        // // Store available character frequencies
        // for (int i = 0; i < chars.length(); i++) {

        //     char ch = chars.charAt(i);

        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // }

        // // Check every word
        // for (String word : words) {

        //     HashMap<Character, Integer> temp = new HashMap<>(map);

        //     boolean good = true;

        //     for (int i = 0; i < word.length(); i++) {

        //         char ch = word.charAt(i);

        //         if (temp.getOrDefault(ch, 0) > 0) {

        //             temp.put(ch, temp.get(ch) - 1);

        //         } else {
        //             good = false;
        //             break;
        //         }
        //     }

        //     if (good) {
        //         sum += word.length();
        //     }
        // }

        // return sum;

        int[] freq = new int[26];
        int sum = 0;

        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }

        for (String word : words) {

            int[] temp = freq.clone();
            boolean good = true;

            for (int i = 0; i < word.length(); i++) {

                int index = word.charAt(i) - 'a';

                temp[index]--;

                if (temp[index] < 0) {
                    good = false;
                    break;
                }
            }

            if (good) {
                sum += word.length();
            }
        }

        return sum;
    }
}
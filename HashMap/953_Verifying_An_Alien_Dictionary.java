/*
953. Verifying an Alien Dictionary
In an alien language, surprisingly they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.
Given a sequence of words written in the alien language, and the order of the alphabet, return
    true if and only if the given words are sorted lexicographically in this alien language.

Example 1: Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz" Output: true Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2: Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz" Output: false Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Difficulty : easy

Approach : HashMap.
1. Create an array of size 26 to store the rank of each character in the alien language based on the given order.
2. Iterate through the words array and compare each word with the next one to check if they are in the correct order.
3. For each pair of words, compare their characters one by one until a difference is found or until the end of the shorter word is reached.
4. If a difference is found, check the ranks of the differing characters using the rank array. If the rank of the character in the first word is greater than that in the second word, return false.
5. If all characters are the same and the first word is longer than the second word, return false.
6. If all pairs of words are in the correct order, return true.

Time Complexity: O(n * m) where n is the number of words and m is the average length of the words, since we compare each character of each word.
Space Complexity: O(1) since the rank array has a fixed size of 26.

 */
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        int[] rank = new int[26];

        for (int i = 0; i < order.length(); i++) {
            rank[order.charAt(i) - 'a'] = i;
        }
        // rank['h' - 'a']

        boolean result = true;

        for(int j = 0; j<words.length -1; j++ ){

            String first = words[j];
            String second = words[j + 1];

            int minLength = Math.min(first.length(), second.length());
            boolean different = false;
            for (int i = 0; i < minLength; i++) {

                if (first.charAt(i) != second.charAt(i)) {

                    different = true;
                    if (rank[first.charAt(i) - 'a'] >
                        rank[second.charAt(i) - 'a']) {

                        return false;
                    }

                    break;
                }
            }

            // All common characters were equal
           if (!different && first.length() > second.length()) {
                return false;
            }
        }

        return true;

        // HashMap<Character, Integer> rank = new HashMap<>();

        // for (int i = 0; i < order.length(); i++) {
        //     rank.put(order.charAt(i), i);
        // }

        // for (int j = 0; j < words.length - 1; j++) {

        //     String first = words[j];
        //     String second = words[j + 1];

        //     int minLength = Math.min(first.length(), second.length());

        //     boolean different = false;

        //     for (int i = 0; i < minLength; i++) {

        //         if (first.charAt(i) != second.charAt(i)) {

        //             different = true;

        //             if (rank.get(first.charAt(i)) > rank.get(second.charAt(i))) {
        //                 return false;
        //             }

        //             break;
        //         }
        //     }

        //     if (!different && first.length() > second.length()) {
        //         return false;
        //     }
        // }

        // return true;
    }
}
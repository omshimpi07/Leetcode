/*
1662. Check If Two String Arrays are Equivalent
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true

Difficulty : easy

Approach : Stringbuilder.
1. Concatenate all strings in word1 and word2 using StringBuilder.
2. Compare the resulting strings for equality.
3. Return true if they are equal, otherwise return false.
Time Complexity: O(n + m) where n is the total length of strings in word1 and m is the total length of strings in word2.
Space Complexity: O(n + m) for storing the concatenated strings in StringBuilder.

*/

class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        // String str1 = "";
        // String str2 = "";

        // for (int i = 0; i < word1.length; i++) {
        //     str1 += word1[i];
        // }

        // for (int i = 0; i < word2.length; i++) {
        //     str2 += word2[i];
        // }

        // return str1.equals(str2);

        //2.Stringbuilder Version
        // StringBuilder str1 = new StringBuilder();
        // StringBuilder str2 = new StringBuilder();

        // for (int i = 0; i < word1.length; i++) {
        //     str1.append(word1[i]);
        // }

        // for (int i = 0; i < word2.length; i++) {
        //     str2.append(word2[i]);
        // }

        // return str1.toString().equals(str2.toString());

        //3.joiner
        // return String.join("", word1).equals(String.join("", word2));

        //4 Pointer

        int i = 0;
        int j = 0;

        int p1 = 0;
        int p2 = 0;

        while (i < word1.length && j < word2.length) {

            if (word1[i].charAt(p1) != word2[j].charAt(p2)) {
                return false;
            }

            p1++;
            p2++;

            // Move to next word in word1
            if (p1 == word1[i].length()) {
                i++;
                p1 = 0;
            }

            // Move to next word in word2
            if (p2 == word2[j].length()) {
                j++;
                p2 = 0;
            }
        }

        return i == word1.length && j == word2.length;
    
    }
}
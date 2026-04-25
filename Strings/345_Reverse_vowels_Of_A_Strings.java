/*
345. Reverse Vowels of a String
Link: https://leetcode.com/problems/reverse-vowels-of-a-string/
Given a string s, reverse only all the vowels in the string and return it.
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.

Example 1: Input: s = "hello" Output: "holle"
Example 2: Input: s = "leetcode" Output: "leotcede"

Difficulty: Medium

Approach:
1. Use two pointers, one starting from the beginning of the string and the other from the end.
2. Move the left pointer forward until it points to a vowel, and move the right pointer
backward until it points to a vowel.
3. Swap the characters at the left and right pointers, then move both pointers towards the center.
Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for the character array used to store the modified string.

*/

class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {

            // move i to next vowel
            while (i < j && !isVowel(arr[i])) {
                i++;
            }
            // move j to previous vowel
            while (i < j && !isVowel(arr[j])) {
                j--;
            }
            // swap vowels
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        return new String(arr);
    }
    // helper function
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

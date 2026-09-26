/*
917. Reverse Only Letters

Given a string s, reverse the string according to the following rules:
All the characters that are not English letters remain in the same position.
All the English letters (lowercase or uppercase) should be reversed.
Return s after reversing it.

Example 1: Input: s = "ab-cd" Output: "dc-ba"

Difficulty: Easy

Approach:
1. Use two pointers, one starting at the beginning of the string and the other at the end of the string.
2. Move the left pointer forward until it points to a letter, and move the right pointer backward until it points to a letter.
3. Swap the characters at the left and right pointers, then move both pointers towards the center.

Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for the character array used to store the modified string.

*/

class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {
                left++;
            }
            else if (!Character.isLetter(arr[right])) {
                right--;
            }
            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);



        // StringBuilder sb1 = new StringBuilder();

        // // Collect only letters from right to left
        // for (int i = s.length() - 1; i >= 0; i--) {

        //     char c = s.charAt(i);

        //     if (Character.isLetter(c)) {
        //         sb1.append(c);
        //     }
        // }

        // String reverse = sb1.toString();

        // StringBuilder sb2 = new StringBuilder();

        // int j = 0;  // points to next reversed letter

        // // Rebuild original positions
        // for (int i = 0; i < s.length(); i++) {

        //     char c = s.charAt(i);

        //     if (Character.isLetter(c)) {
        //         sb2.append(reverse.charAt(j));
        //         j++;
        //     } else {
        //         sb2.append(c);
        //     }
        // }

        // return sb2.toString();
    }
}
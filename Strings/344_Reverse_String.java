/*
344. Reverse String
Write a function that reverses a string. The input string is given as an array of characters
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Example 1:
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

Constraints:
1 <= s.length <= 105
s[i] is a printable ascii character.
Difficulty: Easy
Approach:
1. Use two pointers, one starting at the beginning of the array and the other at the end of the array.
2. Swap the characters at the two pointers and move the pointers towards each other until they meet.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) since we are modifying the input array in-place and not using any additional data structures.

*/

class Solution {
    public void reverseString(char[] s) {
        
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}
/*
9. Palindrome Number
Given an integer x, return true if x is a palindrome, and false otherwise.  
Example 1: Input: x = 121 Output: true Explanation: 121 reads as 121 from left to right and from right to left.
Example 2: Input: x = -121 Output: false Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3: Input: x = 10 Output: false Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

Difficulty: Easy

Approach:
1. Convert the integer to a string and check if the string is the same when reversed.
2. Use two pointers to compare characters from the start and end of the string until they meet in the middle.
Time Complexity: O(n) where n is the number of digits in the integer.   
Space Complexity: O(n) for the string representation of the integer.

*/

class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) return false;
        
        boolean p = true;
        String s = String.valueOf(x);
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while(left < right){

            if(ch[left] != ch[right]){
                return p = false;
            }
            left++;
            right--;
        }
        return p;
    }
}
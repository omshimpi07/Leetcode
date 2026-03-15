/*
125. Valid Palindrome
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Example 1: Input: s = "A man, a plan, a canal: Panama" Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2: Input: s = "race a car" Output: false
Explanation: "raceacar" is not a palindrome.

Constraints:
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.

Difficulty: Easy
Approach:   
1. Remove all non-alphanumeric characters and convert the string to lowercase.
2. Use two pointers, one starting at the beginning of the string and the other at the end of the string, to compare characters. Move the pointers towards each other until they meet.

Time Complexity: O(n) where n is the length of the string.
Space Complexity: O(n) for storing the cleaned string.  

*/

class Solution {
    public boolean isPalindrome(String s) {
        

        
        //all uppercases to lower cases , all non alpha numeric character , 
        
        String S =  s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        for(int i = 0; i<S.length()/2;i++){

            int n = S.length();
            
            if(S.charAt(i) != S.charAt(n - 1 - i)){
                return false;
            }

        }
        return true; 
    }
}
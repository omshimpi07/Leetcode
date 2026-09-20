/* 
3498. Reverse Degree of a String

Given a string s, calculate its reverse degree.
The reverse degree is calculated as follows:
For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
Sum these products for all characters in the string.
Return the reverse degree of s.

Example 1: Input: s = "abc" Output: 148
Explanation:
Letter	Index in Reversed Alphabet	Index in String	Product
'a'	26	1	26
'b'	25	2	50
'c'	24	3	72
The reversed degree is 26 + 50 + 72 = 148.

Difficulty : easy

Approach : Reverse Alphabet Calculation.
1. Iterate through each character in the string.
2. For each character, calculate its position in the reversed alphabet using the formula: reverseValue = 'z' - ch + 1.
3. Multiply the reverseValue by its position in the string (1-indexed) and add it to the total sum.

Time Complexity: O(n) where n is the length of the string, since we process each character once.
Space Complexity: O(1) since we use a constant amount of space for variables.

*/

class Solution {
    public int reverseDegree(String s) {
        
        
        // int abc[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        // int reverse[] = new int[26];
        // int minu = 71;

        // for(int i = 0 ; i< 26; i++)
        // {
        //     reverse[i] = abc[i] - minu  ;
        //     minu += 2;
        // }
        // int ans = 0;

        // for(int j = 0; j < s.length() ; j++){

        //     for(int i = 0; i< abc.length; i++){

        //         if(s.charAt(j) == abc[i]){
        //             ans += reverse[i] * (j + 1);
        //         }
        //     }

        // }
        

        // return ans;

        int ans = 0;

        for (int j = 0; j < s.length(); j++) {

            char ch = s.charAt(j);

            int reverseValue = 'z' - ch + 1;

            ans += reverseValue * (j + 1);
        }

        return ans;


        
    }
}
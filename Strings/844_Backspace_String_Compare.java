/*
844. Backspace String Compare
Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.  

Example 1: Input: s = "ab#c", t = "ad#c" Output: true
Explanation: Both s and t become "ac".
Example 2: Input: s = "ab##", t = "c#d#" Output: true
Explanation: Both s and t become "".

Difficulty : easy

Approach:
1. Use two StringBuilder objects to build the final strings after processing the backspace characters for both input strings s and t.
2. Iterate through each character in the input strings s and t. If the character is not a backspace ('#'), append it to the respective StringBuilder. If the character is a backspace, remove the last character from the StringBuilder if it is not empty.
3. After processing both strings, compare the final strings built by the StringBuilders. If they are equal, return true; otherwise, return false.

Time Complexity: O(n + m) where n and m are the lengths of the input strings s and t, respectively.
Space Complexity: O(n + m) for the StringBuilder objects that store the final processed strings.

*/

class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        while(i<s.length()){

            if(s.charAt(i) != '#' ){
                sb.append(s.charAt(i));
            }else{
                if(sb.length() > 0){
                sb.deleteCharAt(sb.length() - 1);
                }
            }
            i++;
        }
        while(j < t.length()){
            if(t.charAt(j) != '#'){
                sb1.append(t.charAt(j));
            }else{
                if(sb1.length() > 0){
                    sb1.deleteCharAt(sb1.length() - 1);
                }
            }
            j++;
        }
        if(sb.toString().equals(sb1.toString())){
                return true;
        }
        return false;
    }
}
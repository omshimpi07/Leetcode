/*
2390. Removing Stars From a String
You are given a string s, which contains stars *.
In one operation, you can:
Choose a star in s and remove the closest non-star character to its left, as well as remove the star itself.
Return the string after all stars have been removed.

Example 1: Input: s = "leet**cod*e" Output: "lecoe"
Example 2: Input: s = "erase*****" Output: ""

Difiiculty : medium

Approach : Stack.
1. Create a stack to keep track of the characters in the string.
2. Iterate through the characters in the string. If the character is not a star, push it onto the stack. If it is a star, pop the top character from the stack (which is the closest non-star character to the left) and discard both the popped character and the star.
3. After processing all characters, the stack will contain the remaining characters in reverse order. Pop all characters from the stack and append them to a StringBuilder, then reverse the StringBuilder to get the final result.
Time Complexity: O(n) where n is the length of the input string.
Space Complexity: O(n) for the stack and the StringBuilder.

*/

class Solution {
    public String removeStars(String s) {
        
        char arr[] = s.toCharArray();
        Stack<Character> S = new Stack<>();

        for(int i = 0; i<arr.length;i++){

            if(arr[i] != '*'){
                S.push(arr[i]);
            }
            if( arr[i] == '*'){
                S.pop();
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!S.isEmpty()){
            sb.append(S.pop());
        }
        sb.reverse();
        return sb.toString();

    }
}
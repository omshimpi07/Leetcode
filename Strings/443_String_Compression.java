/*
443. String Compression
Link: https://leetcode.com/problems/string-compression/

Difficulty: Medium
Approach:
1. Use a StringBuilder to build the compressed string.
2. Iterate through the input character array and count consecutive characters.
3. Append the character and its count (if greater than 1) to the StringBuilder
4. Copy the compressed string back to the input character array and return the new length.

Time Complexity: O(n) where n is the length of the input character array.
Space Complexity: O(n) for the StringBuilder used to build the compressed string.   

*/

class Solution {
    public int compress(char[] chars) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<chars.length;i++){
            char current = chars[i]; 
            int count = 1;

            while(i < chars.length-1 && chars[i] == chars[i+1] ){

                count++;
                i++;
            }
            sb.append(current);

            if(count > 1){
                sb.append(count);
            }
            
        }
        for(int i = 0; i<sb.length();i++){
            chars[i] = sb.charAt(i);
        }

        return sb.length();
    }
}

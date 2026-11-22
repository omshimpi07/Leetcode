/*
2124. Check if All A's Appears Before All B's

Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.

Example 1:Input: s = "aaabbb" Output: true
Explanation:The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
Hence, every 'a' appears before every 'b' and we return true.

Example 2: Input: s = "abab" Output: false
Explanation:There is an 'a' at index 2 and a 'b' at index 1.
Hence, not every 'a' appears before every 'b' and we return false.

Difficulty : Easy
*/

class Solution {
    public boolean checkString(String s) {
        
        // int index =s.length();

        // for(int i = 0; i< s.length(); i++){


        //     if(s.charAt(i) == 'b'){

        //         index = i;
        //         break;
        //     }
        // }

        // for(int j = index; j< s.length() ; j++){

        //     if(s.charAt(j) == 'a'){
        //         return false;
        //     }
        // }

        // return true;

        boolean seenB = false;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'b') {
                seenB = true;
            }
            else if (seenB) {
                return false;
            }
        }

        return true;

    }
}
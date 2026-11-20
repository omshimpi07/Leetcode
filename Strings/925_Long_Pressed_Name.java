/* 
925. Long Pressed Name

Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.

Example 1: Input: name = "alex", typed = "aaleex" Output: true
Explanation: 'a' and 'e' in 'alex' were long pressed.

Example 2: Input: name = "saeed", typed = "ssaaedd" Output: false
Explanation: 'e' must have been pressed twice, but it was not in the typed output.

Difficulty : Easy
*/

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        
        int left = 0;
        int right = 0;

        // if(!typed.contains(name)){
        //     return false;
        // }

        while( right < typed.length()){

            if(name.charAt(left) == typed.charAt(right)){

                right++;
                left++;
            }
            else if(name.charAt(left) != typed.charAt(right) && typed.charAt(right) == typed.charAt(right - 1)){

                right++;
            }
            else{
                return false;
            }
        }

        return left == name.length();
    }
}
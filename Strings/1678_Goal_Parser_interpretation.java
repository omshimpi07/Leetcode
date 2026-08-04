/*
1678. Goal Parser Interpretation

You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

Example 1: Input: command = "G()(al)" Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2: Input: command = "G()()()()(al)" Output: "Gooooal"
Example 3: Input: command = "(al)G(al)()()G" Output: "alGalooG"
 
Difficulty : easy

Approach : String.
1. Initialize a StringBuilder to build the interpreted string.
2. Iterate through each character of the command string:
   a. If the character is 'G', append "G" to the StringBuilder.
   b. If the character is '(', check the next character:
      - If it is ')', append "o" to the StringBuilder and skip the next character.
      - If it is 'a', append "al" to the StringBuilder and skip the next three characters.  

Time Complexity: O(n) where n is the length of the command string, since we iterate through the string once.
Space Complexity: O(n) for the StringBuilder storing the interpreted string. 

*/

class Solution {
    public String interpret(String command) {
        
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < command.length(); i++)

            if (command.charAt(i) == 'G'){
                sb.append("G");
            }
            else if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                sb.append("o");
                i++;
            }else{
                sb.append("al");
                i += 3;
            }
        
        return sb.toString();

    }
}
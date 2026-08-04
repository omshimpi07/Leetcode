"""
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
1. Initialize an empty list result to store the interpreted characters.
2. Use a while loop to iterate through the command string with an index i.
3. Inside the loop, check the character at index i:
   a. If it is "G", append "G" to result and increment i by 1.
   b. If it is "(", check the next character:
      - If it is ")", append "o" to result and increment i by 2.
      - If it is "a", append "al" to result and increment i by 4.   
      
Time Complexity: O(n) where n is the length of the command string, since we iterate through the string once.
Space Complexity: O(n) for the StringBuilder storing the interpreted string. 

"""

class Solution:
    def interpret(self, command: str) -> str:
        
        result = []

        i = 0

        while i < len(command):

            if command[i] == "G":
                result.append("G")
                i += 1

            elif command[i] == "(" and command[i + 1] == ")":
                result.append("o")
                i += 2

            else:
                result.append("al")
                i += 4

        return "".join(result)
"""
806. Number of Lines To Write String

You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.
You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels. Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this process until you have written all of s.
Return an array result of length 2 where:
result[0] is the total number of lines.
result[1] is the width of the last line in pixels.
 
Example 1: Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz" Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.
Example 2: Input: widths = [4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "bbbcccdddaaa" Output: [2,4]
Explanation: You can write s as follows:
bbbcccdddaa  // 98 pixels wide
a            // 4 pixels wide
There are a total of 2 lines, and the last line is 4 pixels wide.

Difficulty : easy

Appraoch :
1. Initialize two variables, lines and current_width, to keep track of the number of lines
2. Iterate through each character in the string s.
3. For each character, calculate its index in the widths array by subtracting the ASCII value of 'a' from the ASCII value of the character.
4. Check if adding the width of the current character to current_width exceeds 100 pixels.
5. If it does not exceed 100 pixels, add the width of the current character to current_width.
6. If it exceeds 100 pixels, increment lines by 1 and set current_width to the width of the current character.

The final result is returned as a list containing the total number of lines and the width of the last line.
Time Complexity : O(n), where n is the length of the string s. We iterate through each character in s once.
Space Complexity : O(1), as we are using a constant amount of extra space for the variables lines and current_width, regardless of the input size.

"""

class Solution:
    def numberOfLines(self, widths: List[int], s: str) -> List[int]:
        
        # break1 = 1
        # minwid = 0
        # output = [0, 0]
        # index = 0

        # for i in range(len(s)):

        #     index = ord(s[i]) - ord('a')

        #     if minwid + widths[index] <= 100:

        #         minwid += widths[index]
        #     else:
        #         break1 += 1
        #         minwid = widths[index]
        
        # output[0] = break1
        # output[1] = minwid

        # return output
        lines = 1
        current_width = 0

        for ch in s:

            index = ord(ch) - ord('a')

            if current_width + widths[index] <= 100:
                current_width += widths[index]
            else:
                lines += 1
                current_width = widths[index]

        return [lines, current_width]


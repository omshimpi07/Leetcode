/*
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

Approach : Iteration.
1. Initialize a counter for the number of lines (break1) and a variable to track
    the width of the current line (minwid).
2. Iterate through each character in the string s:
   a. Calculate the index of the character in the widths array (index = s.charAt (i) - 'a').
   b. Check if adding the width of the current character (widths[index]) to min 
3. If it does not exceed 100, add the width to minwid.
   c. If it exceeds 100, increment the line counter (break1) and reset minwid to 
    the width of the current character (widths[index]).
4. After processing all characters, return an array containing the total number of lines and the width of the last line.

Time Complexity: O(n) where n is the length of the string s, since we iterate through each character once.
Space Complexity: O(1) since we are using a constant amount of space for the counters and the output array.

 */

class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        
        int break1 = 1;
        int minwid = 0;
        int output[] = new int[2];
        int index = 0;

        for(int i = 0; i< s.length() ; i++){

            index = s.charAt(i) - 'a';

            if(minwid + widths[index] <= 100){

                minwid += widths[index];
                
            }
            else{

                break1++;
                minwid = widths[index]; // current character goes to new line
    
            }
            
        }
        output[0] = break1;
        output[1] = minwid;

        return output;


    }
}
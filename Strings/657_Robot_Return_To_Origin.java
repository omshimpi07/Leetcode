/*
657. Robot Return to Origin
There is a robot starting at the position (0, 0), the origin, on a 2D plane. Given a sequence of its moves, judge if this robot ends up at (0, 0) after it completes its moves.
The move sequence is represented by a string, and the character moves[i] represents its ith move. Valid moves are R (right), L (left), U (up), and D (down). If the robot returns to the origin after it finishes all of its moves, return true. Otherwise, return false.

Example 1: Input: moves = "UD" Output: true
Example 2: Input: moves = "LL" Output: false

moves consists of only the characters 'U', 'D', 'L' and 'R'.

Difficulty: Easy

Approach:
1. Initialize two counters, one for horizontal movement (count) and one for vertical movement (count2).
2. Iterate through the moves string and update the counters based on the direction of each move:
   - Increment count for 'R' and decrement for 'L'.
   - Increment count2 for 'U' and decrement for 'D'.            
3. After processing all moves, check if both counters are zero. If they are, the robot has returned to the origin, and we return true. Otherwise, we return false.
Time Complexity: O(n) where n is the length of the moves string.
Space Complexity: O(1) since we are using only a fixed amount of space for the counters.
*/

class Solution {
    public boolean judgeCircle(String moves) {
        
        int count = 0;
        int count2 = 0;
        for(int i = 0; i< moves.length();i++){

            char ch = moves.charAt(i);
            if(ch == 'R'){
                count++;
            }
            if(ch == 'L'){
                count--;
            }
            if(ch == 'U'){
                count2++;
            }
            if(ch == 'D'){
                count2--;
            }
        }
        if(count == 0 && count2 == 0){
            return true;
        }else{
            return false;
        }
    }
}

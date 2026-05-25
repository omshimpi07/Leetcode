/*
735. Asteroid Collision
We are given an array asteroids of integers representing asteroids in a row.
For each asteroid, the absolute value represents its size, and the sign represents its direction (positive meaning right, negative meaning left). Each asteroid moves at the same speed.
Find out the state of the asteroids after all collisions. If two asteroids meet, the smaller one will explode. If both are the same size, both will explode. Two asteroids moving in the same direction will never meet.

Example 1: Input: asteroids = [5,10,-5] Output: [5,10] Explanation: The 10 and -5 collide resulting in 10. The 5 and 10 never collide.
Example 2: Input: asteroids = [8,-8] Output: [] Explanation: The 8 and -8 collide exploding each other.
Example 3: Input: asteroids = [10,2,-5] Output: [10] Explanation: The 2 and -5 collide resulting in -5. The 10 and -5 collide resulting in 10.

Difficulty : medium

Approach : Stack.
1. Create a stack to keep track of the asteroids.
2. Iterate through the asteroids. For each asteroid, check if it is moving to the right (positive) or to the left (negative).
3. If the asteroid is moving to the right, push it onto the stack.
4. If the asteroid is moving to the left, check for collisions with the asteroids in the stack. While there are asteroids in the stack that are moving to the right and have a smaller size than the current asteroid, pop them from the stack (they explode). If there is an asteroid in the stack that has the same size as the current asteroid, pop it from the stack (both explode) and break out of the loop. If there is an asteroid in the stack that has a larger size than the current asteroid, break out of the loop (the current asteroid explodes).
5. If the current asteroid has not exploded, push it onto the stack.
6. After processing all asteroids, the stack will contain the remaining asteroids in the correct order. Pop all asteroids from the stack and store them in an array to return as the final result.
Time Complexity: O(n) where n is the number of asteroids.
Space Complexity: O(n) for the stack and the output array.

*/

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        Stack<Integer> S = new Stack<>();
        for(int i = 0; i<asteroids.length;i++){
            boolean destroyed = false;
            while(!S.isEmpty() && S.peek() > 0 && asteroids[i] < 0){

                if(Math.abs(S.peek() ) < Math.abs(asteroids[i])){
                    S.pop();
                }
                else if(Math.abs(S.peek() ) == Math.abs(asteroids[i])){

                    S.pop();
                    destroyed = true;
                    break;
                }
                else{
                    destroyed = true;
                    break;
                }
            }
            if ( destroyed != true) {
                S.push(asteroids[i]);
            }
        }
        
        int[] nums = new int[S.size()];

        for(int i = S.size() - 1; i >= 0; i--) {
            nums[i] = S.pop();
        }
        return nums;
    }
}
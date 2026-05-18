/*
1732. Find the Highest Altitude
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n). Return the highest altitude of a point.

Example 1: Input: gain = [-5,1,5,0,-7] Output: 1 Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1. Example 2: Input: gain = [-4,-3,-2,-1,4,3,2] Output: 0 Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.
Difficulty : easy

Approach:
1. Initialize two variables, curr and max, to keep track of the current altitude and the
maximum altitude found so far.
2. Iterate through the input array gain, and for each element:
    - Update the current altitude by adding the net gain in altitude (curr += gain[i]).
    - Update the maximum altitude found so far by comparing it with the current altitude (max = Math.max(max, curr)).   
3. After iterating through the array, return the maximum altitude found.
Time Complexity: O(n) where n is the length of the input array, since we are iterating through the array once.
Space Complexity: O(1) since we are using only a constant amount of extra space to store the current and maximum altitudes.

*/

class Solution {
    public int largestAltitude(int[] gain) {

        int curr = 0;
        int max = 0;

        for (int i = 0; i<gain.length;i++) {

            curr += gain[i];
            max = Math.max(max, curr);
        }
        return max;
    }
}
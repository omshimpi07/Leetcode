/*
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Example 1:
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:  
Input: height = [4,2,0,3,2,5]
Output: 9
Constraints:
n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5
Difficulty: Hard
Approach:
1. Create two arrays, leftmax and rightmax, to store the maximum height to the left and right of each bar.
2. Traverse the height array from left to right to fill the leftmax array, and from
    right to left to fill the rightmax array.
3. Finally, traverse the height array again to calculate the trapped water at each index using the formula: trapped_water += min(leftmax[i], rightmax[i]) - height[i].
Time Complexity: O(n)
Space Complexity: O(n)

 */

class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        
        int leftmax[] = new int[n];
        leftmax[0] = height[0];

        for(int i = 1; i < n ; i++){
            
            leftmax[i] = Math.max(height[i],leftmax[i-1]);

        }

        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];

        for(int i = n-2; i >=0; i--){

            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }

        int trapped_water = 0;

        for(int i = 0; i < n; i++){

            int water_level = Math.min(leftmax[i],rightmax[i]);

            trapped_water += water_level - height[i];

        }

        return trapped_water;
    }
    
};

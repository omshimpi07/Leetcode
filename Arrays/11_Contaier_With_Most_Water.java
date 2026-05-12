/*
11. Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.q

Example 1: Input: height = [1,8,6,2,5,4,8,3,7] Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2: Input: height = [1,1] Output: 1

Difficulty: Medium

Approach:
1. Use two pointers, one starting at the beginning of the array (left) and the other at the end of the array (right).
2. Calculate the area formed by the lines at the left and right pointers and update the maximum area if necessary.
3. Move the pointer that has the shorter line towards the other pointer, as this may increase the area.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) as we are using only a constant amount of extra space.

*/

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length-1;
        int ans = 0;
        while(left < right){

            int width = right - left;
            int h = Math.min(height[left] , height[right]);
            ans = Math.max(ans,width * h);

            if(height[left] < height[right] ){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}
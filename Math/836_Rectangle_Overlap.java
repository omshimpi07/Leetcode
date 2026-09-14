/*
836. Rectangle Overlap

An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.
Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.
Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.

Example 1: Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]Output: true
Example 2: Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1] Output: false

Difficulty : easy

approach : Math.
1. To determine if two rectangles overlap, we can check the conditions for non-overlapping rectangles.
2. Two rectangles do not overlap if one is completely to the left, right, above, or below the other.
3. Specifically, for rectangles rec1 = [x1, y1, x2, y2] and rec2 = [x3, y3, x4, y4], they do not overlap if:
   - rec1 is to the left of rec2: x2 <= x3
   - rec1 is to the right of rec2: x1 >= x4
   - rec1 is above rec2: y1 >= y4
   - rec1 is below rec2: y2 <= y3
4. If none of these conditions are true, then the rectangles must overlap.

Time Complexity: O(1) since we are performing a constant number of comparisons.
Space Complexity: O(1) since we are using a constant amount of space for the comparisons.

*/

class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

    return rec1[0] < rec2[2] &&
               rec2[0] < rec1[2] &&
               rec1[1] < rec2[3] &&
               rec2[1] < rec1[3];
    }
}
"""
836. Rectangle Overlap

An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.
Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.
Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.

Example 1: Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]Output: true
Example 2: Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1] Output: false

Difficulty : easy

Approach:
1. Check if the rectangles do not overlap by comparing their coordinates.
2. If one rectangle is to the left of the other or one rectangle is above the other, they do not overlap.
3. If none of these conditions are met, the rectangles overlap.
4. Return the result of the overlap check.

Time Complexity: O(1) - The solution involves a constant number of comparisons.
Space Complexity: O(1) - The solution uses a constant amount of space.

"""

class Solution:
    def isRectangleOverlap(self, rec1: List[int], rec2: List[int]) -> bool:
        
        return(
            rec1[0] < rec2[2] and \
            rec2[0] < rec1[2] and \
            rec1[1] < rec2[3] and \
            rec2[1] < rec1[3]
        )
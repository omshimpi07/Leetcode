/*
452. Minimum Number of Arrows to Burst Balloons
There are a number of spherical balloons spread in two-dimensional space. For each balloon, provided input
is the start and end coordinates of the horizontal diameter. Since it's horizontal, y-coordinates don't matter and hence the x-coordinates of start and end of the diameter suffice. The start is always smaller than the end.
An arrow can be shot up directly from different points along the x-axis. A balloon with xstart and xend bursts by an arrow shot at x if xstart ≤ x ≤ xend. The goal is to burst all balloons with the minimum number of arrows.     
Given an array points where points[i] = [xstart, xend], return the minimum number of arrows that

Example 1: Input: points = [[10,16],[2,8],[1,6],[7,12]] Output: 2 Explanation: One way is to shoot one arrow at x = 6 (bursting the balloons [2,8] and [1,6]) and another arrow at x = 11 (bursting the other two balloons).
Example 2: Input: points = [[1,2],[3,4],[5,6],[7,8]] Output: 4 Explanation: One arrow

Difficulty : medium

Approach : Greedy.
1. Sort the balloons based on their end coordinates in ascending order.
2. Initialize a variable arrows to 1 (since at least one arrow is needed) and a variable arrowPos to the end coordinate of the first balloon.
3. Iterate through the sorted balloons starting from the second balloon:

Time Complexity: O(n log n) due to sorting the balloons, where n is the number of balloons.
Space Complexity: O(1) if we ignore the space used for sorting, otherwise O(n)

*/

class Solution {

    public int findMinArrowShots(int[][] points) {

        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int arrows = 1;
        int arrowPos = points[0][1];

        for (int i = 1; i < points.length; i++) {

            if (points[i][0] > arrowPos) {

                arrows++;
                arrowPos = points[i][1];
            }
        }

        return arrows;
    }
}
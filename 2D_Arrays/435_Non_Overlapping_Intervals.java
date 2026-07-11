/*
435. Non-overlapping Intervals
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping. 
Note: You may assume that the end of an interval is always greater than its start.

Example 1: Input: intervals = [[1,2],[2,3],[3,4],[1,3]] Output: 1 Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.

Example 2: Input: intervals = [[1,2],[1,2],[1,2]] Output: 2 Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.

Difficulty : medium 

Approach : Greedy.
1. Sort the intervals based on their end times in ascending order.
2. Initialize a variable count to keep track of the number of intervals to remove and a variable prevEnd to store the end time of the last added interval.
3. Iterate through the sorted intervals starting from the second interval:
   a. If the start time of the current interval is greater than or equal to prevEnd, update prevEnd to the end time of the current interval.
   b. If the start time of the current interval is less than prevEnd, increment count as this interval overlaps with the previous one and needs to be removed.

Time Complexity: O(n log n) due to sorting the intervals, where n is the number of intervals.
Space Complexity: O(1) if we ignore the space used for sorting, otherwise O(n

*/

class Solution {

    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] >= prevEnd) {

                prevEnd = intervals[i][1];

            } else {

                count++;
            }
        }

        return count;
    }
}
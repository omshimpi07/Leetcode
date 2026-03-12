/*
1051. Height Checker
Students are asked to stand in non-decreasing order of heights for an annual photo.
Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.

Example 1: Input: heights = [1,1,4,2,1,3]
Output: 3 Explanation: Current array : [1,1,4,2,1,3] Target array  : [1,1,1,2,3,4]   

On index 5 (0-based) we have 3 vs 4 so we have to move this student.
Example 2: Input: heights = [5,1,2,3,4] Output: 5

Difficulty: Easy
Approach:
1. Create a copy of the heights array and sort it to get the expected order of heights
2. Initialize a count variable to 0 to keep track of the number of students that need to move.
3. Iterate through the original heights array and compare each element with the corresponding element in the sorted array.
4. If the elements are different, increment the count variable.
5. Return the count variable as the result.
Time Complexity: O(n log n) due to the sorting step.
Space Complexity: O(n) due to the additional array used for sorting.

*/
class Solution {
    public int heightChecker(int[] heights) {
        
        int count = 0;
        int[] expected = heights.clone();
        Arrays.sort(expected);

        for(int i = 0; i<heights.length;i++){
            
                if(heights[i] != expected[i]){

                    count++;

                }
        }
        return count;
    }
}



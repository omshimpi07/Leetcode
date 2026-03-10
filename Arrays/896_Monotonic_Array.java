/* 
896. Monotonic Array
An array is monotonic if it is either monotone increasing or monotone decreasing.
An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].
Return true if and only if the given array A is monotonic.

Example 1:Input: [1,2,2,3] Output: true
Example 2: Input: [6,5,4,4] Output: true
Example 3: Input: [1,3,2] Output: false

Difficulty: Easy

Approach:
1. Initialize two boolean variables, increasing and decreasing, to true.
2. Iterate through the array and compare each element with the next one.
    - If the current element is greater than the next one, set increasing to false.
    - If the current element is less than the next one, set decreasing to false.
3. After the loop, return true if either increasing or decreasing is still true, indicating that the array is monotonic.
Time Complexity: O(n)
Space Complexity: O(1)



*/

class Solution {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = true;
        boolean decreasing = true;

        for(int i = 0; i < nums.length - 1; i++){

            if(nums[i] > nums[i+1]){
                increasing = false;
            }

            if(nums[i] < nums[i+1]){
                decreasing = false;
            }

        }

        return increasing || decreasing;
    }
}
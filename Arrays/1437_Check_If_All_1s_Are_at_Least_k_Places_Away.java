/*

1437. Check If All 1's Are at Least Length K Places Away

Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

Example 1: Input: nums = [1,0,0,0,1,0,0,1], k = 2 Output: true
Explanation: Each of the 1s are at least 2 places away from each other.
 
Difficulty : Easy

*/

class Solution {
    public boolean kLengthApart(int[] nums, int k) {


        int previousOne = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {

                if (previousOne != -1) {
                    int zerosBetween = i - previousOne - 1;

                    if (zerosBetween < k) {
                        return false;
                    }
                }

                previousOne = i;
            }
        }

        return true;
        
    }
}
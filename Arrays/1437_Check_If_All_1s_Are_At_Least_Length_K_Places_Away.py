"""

1437. Check If All 1's Are at Least Length K Places Away

Given an binary array nums and an integer k, return true if all 1's are at least k places away from each other, otherwise return false.

Example 1: Input: nums = [1,0,0,0,1,0,0,1], k = 2 Output: true
Explanation: Each of the 1s are at least 2 places away from each other.
 
Difficulty : Easy

"""

class Solution:
    def kLengthApart(self, nums: list[int], k: int) -> bool:
        previous_one = -1

        for i in range(len(nums)):

            if nums[i] == 1:

                if previous_one != -1:
                    zeros_between = i - previous_one - 1

                    if zeros_between < k:
                        return False

                previous_one = i

        return True
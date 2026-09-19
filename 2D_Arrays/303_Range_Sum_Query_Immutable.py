"""
303. Range Sum Query - Immutable

Given an integer array nums, handle multiple queries of the following type:
Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class
NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1: Input ["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output [null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 
Difficulty : easy

Approach : Prefix Sum
1. Create a prefix sum array where prefix[i] is the sum of elements from nums[0] to nums[i-1].
2. To calculate the sum from index left to right, we can use the formula:
    sumRange(left, right) = prefix[right + 1] - prefix[left]
3. This allows us to compute the sum in O(1) time after an O(n) preprocessing step to build the prefix sum array.

The space complexity is O(n) for storing the prefix sum array.
Time Complexity : O(n) for preprocessing and O(1) for each query.

"""

class NumArray:

    def __init__(self, nums: list[int]):
        self.prefix = [0] * (len(nums) + 1) 
        for i in range(len(nums)): 
            self.prefix[i + 1] = self.prefix[i] + nums[i]

    def sumRange(self, left: int, right: int) -> int:
        return self.prefix[right + 1] - self.prefix[left]


# Your NumArray object will be instantiated and called as such:
# obj = NumArray(nums)
# param_1 = obj.sumRange(left,right)
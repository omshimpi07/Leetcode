/*
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

Approach : Prefix Sum.
1. Create a prefix sum array where each element at index i represents the sum of elements from
2. the original array from index 0 to i-1.
3. To calculate the sum of elements between indices left and right, use the formula:
   sumRange(left, right) = prefix[right + 1] - prefix[left]
4. This allows for O(1) time complexity for each sumRange query after an O(n) preprocessing time to build the prefix sum array.

Time Complexity: O(n) for preprocessing to build the prefix sum array, and O(1) for each sumRange query.
Space Complexity: O(n) for storing the prefix sum array.

 */

 class NumArray {

    // int[] arr; 
    int[] prefix;

    public NumArray(int[] nums) {
        
        // arr = nums;
        prefix = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }


    }
    
    public int sumRange(int left, int right) {
        
        // int sum = 0;

        // for (int i = left; i <= right; i++) {
        //     sum += arr[i];
        // }

        // return sum;

        return prefix[right + 1] - prefix[left];

    }
}



/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
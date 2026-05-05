/*
27. Remove Element
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed. Then return the number of elements in nums which are not equal to val. Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:
Change the array nums such that the first k elements of nums    contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums. Return k.

Example 1: Input: nums = [3,2,2,3],val = 3 Output: 2, nums = [2,2,_,_]
Example 2: Input: nums = [0,1,2,2,3,    0,4,2], val = 2 Output: 5, nums = [0,1,4,0,3,_,_,_]

Difficulty : easy

Approach:
1. Use a pointer k to keep track of the position of the next non-val element in the array.
2. Iterate through the array nums, and for each element that is not equal to val, copy it to the position pointed by k and increment k.
3. After the loop, k will represent the number of elements that are not equal to val, and the first k elements of nums will contain those elements.
Time Complexity: O(n) where n is the length of the input array nums.
Space Complexity: O(1) since we are modifying the input array in place and using only

*/

class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    
}
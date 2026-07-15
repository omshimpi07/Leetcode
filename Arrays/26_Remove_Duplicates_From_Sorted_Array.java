/*
26. Remove Duplicates from Sorted Array

Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have
the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Example 1: Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being   1 and 2 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).

EExample 2: Input: nums = [0,0,1,1,1,2,2,3,3,4] Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3 and 4 respectively. It does not matter what you leave beyond the returned k (hence they are underscores).

Difficulty : easy

Approach : Two Pointers.
1. Use two pointers, one for the current position in the array and one for the next unique element.
2. Iterate through the array, and whenever a new unique element is found, move it to
the position of the current pointer and increment the pointer.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(1) since we are modifying the array in place and not using any extra space.

*/
class Solution {
    public int removeDuplicates(int[] nums) {
        
        // LinkedHashSet<Integer> set1 = new LinkedHashSet<>();

        // for(int i = 0; i<nums.length; i++){

        //     set1.add(nums[i]);
        // }
        // int index = 0;
        // for (int num : set1) {
        //     nums[index++] = num;
        // }

        // return set1.size();

        if (nums.length == 0) return 0;

        int left = 0;  // 1. Keeps track of where the last unique number is stored
        int right = 1; 
        int output = 1; // 2. Start at 1 because the first number is always unique

        for(int i = 0; i < nums.length - 1; i++){

            // FIX 1: Compare the actual values in the array, not the positions
            if(nums[left] != nums[right]){
                
                left++; // Move 'left' to the next available slot
                nums[left] = nums[right]; // FIX 2: Copy the new unique number into it
                output++;
            }
            
            // 'right' moves forward every loop to check the next number
            right++; 
        }
        return output;
    }
}
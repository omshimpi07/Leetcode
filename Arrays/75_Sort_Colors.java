/*
75. Sort Colors
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively. You must solve this problem without using the library's sort function.

Example 1: Input: nums = [2,0,2,1,1,0] Output: [0,0,1,1,2,2]
Example 2: Input: nums = [2,0,1] Output: [0,1,2]

Constraints: n == nums.length || 1 <= n <= 300
nums[i] is either 0, 1, or 2.

Difficulty: Medium
Approach:
1. Initialize three pointers: low, mid, and high. Set low and mid to the beginning of the array and high to the end of the array.
2. Iterate through the array using the mid pointer until it exceeds the high pointer.   
3. If the element at mid is 0, swap it with the element at low and increment both low and mid pointers.
4. If the element at mid is 1, simply move the mid pointer to the next element.
5. If the element at mid is 2, swap it with the element at high and decrement the high pointer. Do not increment the mid pointer in this case, as the swapped element needs to be evaluated.

*/

class Solution {
    public void sortColors(int[] nums) {
        
        int n = nums.length;
        int mid = 0;
        int high = n-1;
        int low = 0;
        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                int temp2 = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp2;
                high--;
            }
        }
    }
}
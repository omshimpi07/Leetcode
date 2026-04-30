/*
905. Sort Array By Parity
Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
You may return any answer array that satisfies this condition.  

Example 1: Input: [3,1,2,4] Output: [2,4,3,1] The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.

Difficulty : easy

Approach:
1. Initialize two pointers, start and end, to keep track of the positions for even and odd numbers in the new array.
2. Iterate through the input array and check if each number is even or odd.
3. If the number is even, place it at the start pointer in the new array and
    increment the start pointer. If the number is odd, place it at the end pointer in the new array and decrement the end pointer.
4. Finally, return the new array with even numbers followed by odd numbers.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the new array that holds the sorted elements.

*/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
    
        int start = 0;
        int end = nums.length-1;
        int[] newArr = new int[nums.length];
        for(int i = 0; i< nums.length; i++){

            if(nums[i] % 2 != 0){
                newArr[end] = nums[i];
                end--;
            }
            if(nums[i] % 2 == 0){
                newArr[start] = nums[i];
                start++;
            }

        }
        return newArr;

    }
}
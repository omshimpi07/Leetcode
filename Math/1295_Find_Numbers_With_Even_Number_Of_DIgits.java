/*
1295. Find Numbers with Even Number of Digits

Given an array nums of integers, return how many of them contain an even number of digits.

Example 1: Input: nums = [12,345,2,6,7896]Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.

Diificulty : easy

Approach : Math.
1. Initialize a counter to keep track of the number of integers with an even number of digits.
2. Iterate through each integer in the input array.
3. For each integer, count the number of digits by repeatedly dividing the integer by 10 until it becomes 0, incrementing a digit counter with each division.
4. After counting the digits, check if the digit count is even. If it is, increment the even counter.
5. After processing all integers, return the even counter as the result.
6. Reset the digit counter for each new integer to ensure accurate counting.
7. Return the final count of integers with an even number of digits.

Time Complexity: O(n * m) where n is the number of integers in the array and
Space Complexity: O(1) since we are using a constant amount of space for the counters.

*/

class Solution {
    public int findNumbers(int[] nums) {
        

        int count = 0;
        int even = 0;
        for(int i = 0; i< nums.length ; i++){

            while(nums[i] > 0){

                count++;
            
                nums[i] /= 10;
            }
            if(count % 2 == 0){
                even++;
            }
            count = 0;
            
        }

        return even;
        
    }

}
/*
1523. Count Odd Numbers in an Interval Range

Given two non-negative integers low and high. Return the count of odd numbers between low and high (inclusive).

Example 1: Input: low = 3, high = 7 Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].

Approach : Math.
1. The number of odd numbers from 0 to high can be calculated as (high + 1) / 2.
2. The number of odd numbers from 0 to low - 1 can be calculated as low / 2.
3. The count of odd numbers between low and high (inclusive) is the difference between the two counts calculated above.

Time Complexity: O(1) since we are performing a constant number of arithmetic operations.
Space Complexity: O(1) since we are using a constant amount of space for the calculations.

*/

class Solution {
    public int countOdds(int low, int high) {
        
        // int count = 0;
        // for(int i = low; i<=high; i++){

        //     if(i % 2 != 0 ){
        //         count++;
        //     }
        // }
        // return count;

        // Number of odd numbers from 0 to high
        // minus number of odd numbers before low
        return (high + 1) / 2 - low / 2;
    }
}
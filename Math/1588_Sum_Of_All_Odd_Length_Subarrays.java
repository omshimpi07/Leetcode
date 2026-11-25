/*
1588. Sum of All Odd Length Subarrays

Given an array of positive integers arr, return the sum of all possible odd-length subarrays of arr.

A subarray is a contiguous subsequence of the array.

Example 1: Input: arr = [1,4,2,5,3] Output: 58
Explanation: The odd-length subarrays of arr and their sums are:
[1] = 1
[4] = 4
[2] = 2
[5] = 5
[3] = 3
[1,4,2] = 7
[4,2,5] = 11
[2,5,3] = 10
[1,4,2,5,3] = 15

Difficulty : Easy
*/

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        
        // int sum = 0;

        // for(int i = 0; i< arr.length ; i++){

        //     sum += arr[i];

        // }

        // int odd = 3;

        // while(odd <= arr.length){
            
        //     for(int i = 0; i<= arr.length - odd ; i++){

        //         int[] subArray = Arrays.copyOfRange(arr, i,i + odd);

        //         for (int j = 0; j < subArray.length; j++) {
        //             sum += subArray[j];
        //         }
        //     }
        //     odd += 2;

        // }

        // return sum;

        int sum = 0;
        int odd = 1;

        while (odd <= arr.length) {

            for (int i = 0; i <= arr.length - odd; i++) {

                for (int j = i; j < i + odd; j++) {
                    sum += arr[j];
                }
            }

            odd += 2;
        }

        return sum;

    }
}


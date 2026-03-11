/*
941. Valid Mountain Array
Given an array of integers arr, return true if and only if it is a valid mountain array.
Recall that arr is a mountain array if and only if:
- arr.length >= 3
- There exists some i with 0 < i < arr.length - 1 such that:
    - arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
    - arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

Example 1: Input: arr = [2,1] Output: false
Example 2: Input: arr = [3,5,5] Output: false
Example 3: Input: arr = [0,3,2,1] Output: true

Difficulty: Easy

Approach:
1. Check if the length of the array is less than 3, if so return false
2. Initialize a pointer i to 0 and traverse the array while the next element is greater than the current element (ascending part of the mountain).
3. After the first loop, check if i is at the start or end of the array
4. If not, traverse the array while the next element is less than the current element (descending part of the mountain).
5. Finally, check if i has reached the end of the array, if so return true
Time Complexity: O(n)
Space Complexity: O(1)



*/



class Solution {
    public boolean validMountainArray(int[] arr) {

        int n = arr.length;

        if(n < 3) return false;

        int i = 0;

        while(i + 1 < n && arr[i] < arr[i + 1]){
            i++;
        }

        if(i == 0 || i == n - 1){
            return false;
        }

        while(i + 1 < n && arr[i] > arr[i + 1]){
            i++;
        }
        return i == n - 1;
    }
}
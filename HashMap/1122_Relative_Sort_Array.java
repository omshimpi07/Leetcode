/*
1122.Relative Sort Array
Given two arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1. Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as       in arr2. Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.     
Example 1: Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6] Output: [2,2,2,1,4,3,3,9,6,7,19]
Difficulty : easy

Approach : HashMap.
1. Create a frequency array of size 1001 (since the values are between 0 and 1000) to count the occurrences of each number in arr1.
2. Iterate through arr1 and populate the frequency array.
3. Create an index variable to keep track of the position in arr1 where we will place the sorted elements.
4. Iterate through arr2 and for each number, place it in arr1 according to its frequency in the frequency array. Decrease the frequency count after placing each number.
5. After processing all elements in arr2, iterate through the frequency array and place any remaining numbers (those not in arr2) into arr1 in ascending order.
Time Complexity: O(n + m + k) where n is the length of arr1, m is the length of arr2, and k is the range of numbers (1001 in this case).
Space Complexity: O(k) for the frequency array.

*/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         // Values are between 0 and 1000
        int[] freq = new int[1001];

        // Step 1: Count frequency of every element in arr1
        for (int i = 0; i < arr1.length; i++) {
            freq[arr1[i]]++;
        }

        int index = 0;

        // Step 2: Put arr2 elements first, in arr2 order
        for (int i = 0; i < arr2.length; i++) {

            int num = arr2[i];

            while (freq[num] > 0) {
                arr1[index] = num;
                index++;

                freq[num]--;
            }
        }

        // Step 3: Put remaining elements in ascending order
        for (int num = 0; num <= 1000; num++) {

            while (freq[num] > 0) {
                arr1[index] = num;
                index++;

                freq[num]--;
            }
        }

        return arr1;

        
    }
}
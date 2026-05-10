/*
1089. Duplicate Zeros
Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.  
Example 1: Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4]
Example 2: Input: arr = [1,2,3] Output: [1,2,3]
Difficulty : easy
Approach:
1. Create a temporary array of the same length as the input array to store the modified elements.
2. Iterate through the input array and copy each element to the temporary array. If an element is zero, copy it twice to the temporary array.
3. After processing all elements, copy the modified elements from the temporary array back to the original input array.
Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the temporary array used to store the modified elements.

*/

class Solution {
    public void duplicateZeros(int[] arr) {

        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n && j < n; i++) {

            temp[j] = arr[i];
            j++;
            if (arr[i] == 0 && j < n) {
                temp[j] = 0;
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
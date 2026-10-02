/*
1299. Replace Elements with Greatest Element on Right Side

Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
After doing so, return the array.

Example 1: Input: arr = [17,18,5,4,6,1] Output: [18,6,6,6,1,-1]
Explanation: 
- index 0 --> the greatest element to the right of index 0 is index 1 (18).
- index 1 --> the greatest element to the right of index 1 is index 4 (6).
- index 2 --> the greatest element to the right of index 2 is index 4 (6).
- index 3 --> the greatest element to the right of index 3 is index 4 (6).
- index 4 --> the greatest element to the right of index 4 is index 5 (1).
- index 5 --> there are no elements to the right of index 5, so we put -1.
 
Difficulty : easy

Appraoch : Array.
1. Initialize a variable `greatest` to -1, which will keep track of the greatest element found so far from the right.
2. Create an ArrayList `list1` to store the new values.
3. Iterate through the array from the last element to the first:
   a. For each element, add the current value of `greatest` to `list1`.
   b. Update `greatest` if the current element is greater than `greatest`.
4. After the loop, reverse the `list1` to get the correct order and convert it back to an array.
5. Alternatively, you can perform the operation in-place by iterating from the end of the
    array and updating each element with the current `greatest`, while keeping track of the previous value to update `greatest` accordingly.

Time Complexity: O(n) where n is the number of elements in the array, since we iterate through the array once.
Space Complexity: O(n)

*/
class Solution {
    public int[] replaceElements(int[] arr) {


        // int greatest = arr[arr.length - 1];
        int greatest = -1;

        ArrayList<Integer> list1 = new ArrayList<>();
        
        // list1.add(0, -1);

        // int j = 1;

        for(int i = arr.length -1; i>= 0 ; i--){
        // for(int i = arr.length -2; i>= 0 ; i--){

        //     list1.add(j, greatest);
        //     j++;

            list1.add(greatest);
            if(arr[i] > greatest){
                greatest = arr[i];
            }
           
        }

        int[] result = new int[arr.length];

        int k = 0;
        for (int i = list1.size() -1 ; i >= 0; i--) {
            result[k] = list1.get(i); 
            k++;
        }
        return result;

    //Approach 2 : One Pass optimized Inplace

        // int greater = arr[arr.length - 1];
        // arr[arr.length - 1] = -1;
        int greater = -1;
        // for(int i = arr.length  -2 ; i >= 0 ; i--){
        for(int i = arr.length  -1 ; i >= 0 ; i--){
            int current = arr[i];
            arr[i] = greater;
            if(current > greater){
               
                greater = current;
                
            }
            
            
        }
        return arr;
    
    }
}
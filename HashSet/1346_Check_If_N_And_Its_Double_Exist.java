/*
1346. Check If N and Its Double Exist

Given an array arr of integers, check if there exist two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
 
Example 1: Input: arr = [10,2,5,3] Output: true
Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]

Difficulty : easy

 */

class Solution {
    public boolean checkIfExist(int[] arr) {
        
        // Arrays.sort(arr);
        // boolean ans = false;
        

        // for(int i = 0; i< arr.length ; i++){

            
        //     for(int j = arr.length - 1 ; j >= 0; j-- ){

        //         if(  j != i && arr[i] * 2 == arr[j]){
        //             return true;
        //         }
        //     }
            
        // }

        // return ans;

        
        HashSet<Integer> seen = new HashSet<>();

        for (int x : arr) {

            if (seen.contains(2 * x) ||
                (x % 2 == 0 && seen.contains(x / 2))) {
                return true;
            }

            seen.add(x);
        }

        return false;

    }
}
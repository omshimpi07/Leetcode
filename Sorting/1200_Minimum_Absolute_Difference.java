/*
1200. Minimum Absolute Difference

Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
a, b are from arr
a < b
b - a equals to the minimum absolute difference of any two elements in arr
 
Example 1: Input: arr = [4,2,1,3] Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.

Difficulty : easy

*/

class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        // Arrays.sort(arr);
        // int min = Integer.MAX_VALUE;
        // int abs1 = 0;

        // for(int i = 1; i< arr.length ; i++){

        //     abs1 = Math.abs(arr[i] - arr[i - 1]);
        //     if( abs1 < min ){

        //         min = abs1;
        //     }

        // }

        // ArrayList<List<Integer>> list1 = new ArrayList<>();

        // for(int i = 1; i < arr.length ;  i++ ){

        //     int abs2 = Math.abs(arr[i] - arr[i - 1]);
        //     if(abs2 == min){

        //         list1.add(List.of(arr[i - 1], arr[i]));

        //         //1. Manual way 
        //         // List<Integer> pair = new ArrayList<>();
        //         //     pair.add(arr[i - 1]);
        //         //     pair.add(arr[i]);
    
        //         //     list1.add(pair);

        //     }
        // }

        // return list1;


        ArrayList<List<Integer>> list1 = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        

        for(int i = 1; i< arr.length ; i++){

            int diff = Math.abs(arr[i] - arr[i - 1]);
            if(diff < min){

                min = diff;

                list1.clear();
            }

            if(diff == min){

                list1.add(List.of(arr[i - 1], arr[i]));
            }
        }

        return list1;

    }
}
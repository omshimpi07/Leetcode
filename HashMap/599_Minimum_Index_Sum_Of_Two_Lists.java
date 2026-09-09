/*
599. Minimum Index Sum of Two Lists

Given two arrays of strings list1 and list2, find the common strings with the least index sum.
A common string is a string that appeared in both list1 and list2.
A common string with the least index sum is a common string such that if it appeared at list1[i] and list2[j] then i + j should be the minimum value among all the other common strings.
Return all the common strings with the least index sum. Return the answer in any order.

Example 1: Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"] Output: ["Shogun"]
Explanation: The only common string is "Shogun".

Example 3: Input: list1 = ["happy","sad","good"], list2 = ["sad","happy","good"]
Output: ["sad","happy"]
Explanation: There are three common strings:
"happy" with index sum = (0 + 1) = 1.
"sad" with index sum = (1 + 0) = 1.
"good" with index sum = (2 + 2) = 4.
The strings with the least index sum are "sad" and "happy".
 
Diificulty : easy

Approach : HashMap.
1. Create a HashMap to store the strings from list1 along with their indices.
2. Initialize an ArrayList to store the result and a variable to keep track of the minimum index sum.
3. Iterate through list2 and for each string, check if it exists in the HashMap
    a. If it exists, calculate the index sum by adding the index from list2 and the index from the HashMap.
    b. If the index sum is less than the current minimum, clear the result list, add the string to the result list, and update the minimum index sum.
    c. If the index sum is equal to the current minimum, add the string to the result list.
4. After iterating through list2, convert the result list to an array and return it.

Time Complexity: O(n + m) where n is the length of list1 and m is the length of list2, since we are iterating through both lists once.
Space Complexity: O(n) for storing the strings from list1 in the HashMap.

*/

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        
        // ArrayList<String> ans = new ArrayList<>();
        // int sum = 0;
        // int minSum = Integer.MAX_VALUE;

        // for(int i = 0; i < list1.length; i++){

        //     for(int j = 0 ; j< list2.length; j++){

        //         if(list1[i].equals(list2[j])){
        //             sum = i + j;
        //             if(sum < minSum) {
        //                 ans.clear();
        //                 ans.add(list1[i]);
        //                 minSum = sum;
        //             }
        //             else if(sum == minSum) {
        //                 ans.add(list1[i]);
        //             }
        //         }

        //     }
            
        // }
        // return ans.toArray(new String[0]);
        
        HashMap<String, Integer> map = new HashMap<>();

        // Store restaurant -> index of list1
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i], i);
        }

        ArrayList<String> ans = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Traverse list2
        for(int j = 0; j < list2.length; j++){

            if(map.containsKey(list2[j])){

                int sum = map.get(list2[j]) + j;

                if(sum < minSum){
                    ans.clear();
                    ans.add(list2[j]);
                    minSum = sum;
                }
                else if(sum == minSum){
                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);


    }
}
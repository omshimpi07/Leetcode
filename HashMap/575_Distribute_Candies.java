/*575. Distribute Candies
Alice has n candies, where the ith candy is of type candyType[i]. Alice noticed that she started to gain weight, so she visited a doctor. The doctor advised Alice to only eat n / 2 of the candies she has (n is alwayseven). Alice likes her candies very much, and she wants to eat the maximum number of different types of candies while still following the doctor's advice.
Given the integer array candyType of length n, return the maximum number of different types of candies Alice can eat if she only eats n / 2 of them.

Example 1: Input: candyType = [1,1,2,2,3,3] Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.

Example 2: Input: candyType = [1,1,2,3] Output: 2
Explanation: Alice can only eat 4 / 2 = 2 candies. Whether she eats types [1,2], or types [1,3], or types [2,3], she still can only eat 2 different types.

Difficulty : easy
Approach:
1. Use a HashMap to count the frequency of each type of candy in the input array.
2. Calculate the maximum number of candies Alice can eat, which is n / 2.
3. The maximum number of different types of candies Alice can eat is the minimum between the number of unique candy types (the size of the HashMap) and the maximum number of candies she can eat.

Time Complexity: O(n) where n is the length of the input array.
Space Complexity: O(n) for the HashMap.
*/

class Solution {
    public int distributeCandies(int[] candyType) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< candyType.length;i++){
            
            int presum = candyType[i];
            map.put(presum,map.getOrDefault(presum,0)+1);

        }
        int half = candyType.length / 2;
        int uniqueKeys = map.size();

        return Math.min(uniqueKeys, half);
    }
}
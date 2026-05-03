/*
1431. Kids With the Greatest Number of Candies
Given the array candies and the integer extraCandies, where candies[i] represents the number of
candies that the ith kid has. For each kid check if there is a way to distribute extraCandies among the kids such that he or she can have the greatest number of candies among them. Notice that multiple kids can have the greatest number of candies.

Example 1: Input: candies = [2,3,5,1,3], extraCandies = 3 Output: [true,true,true,false,true] Explanation: Kid 1 has 2 candies and if he or she receives all extraCandies (3) will have 5 candies --- the greatest number of candies among the kids. Kid 2 has 3 candies and if he or she receives at least 2 extraCandies will have the greatest number of candies among the kids. Kid 3 has 5 candies and this is already the greatest number of candies among the kids. Kid 4 has 1 candy and even if he or she receives all extraCandies (3) will only have 4 candies. Kid 5 has 3 candies and if he or she receives at least 2 extraCandies will have the greatest number of candies among the kids.
Example 2: Input: candies = [4,2,1,1,2], extraCandies = 1 Output: [true,false,false,false,false] Explanation: There is only 1 extra candy, therefore only kid 1 will have the greatest number of candies among the kids regardless if he or she takes the extra candy or not. Kid 2 will only have 3 candies if he or she takes the extra candy (3 < 4). Kid 3 will only have 2 candies if he or she takes the extra candy (2 < 4). Kid 4 will only have 2 candies if he or she takes the extra candy (2 < 4). Kid 5 will only have 3 candies if he or she takes the extra candy (3 < 4).
Example 3: Input: candies = [12,1,12], extraCandies = 10 Output: [true,false,true]

Constraints:
2 <= candies.length <= 100
1 <= candies[i] <= 100
1 <= extraCandies <= 50

Difficulty : easy

Approach:
1. First, find the maximum number of candies any kid currently has. This can be done by iterating through the candies array and keeping track of the maximum value.
2. Then, iterate through the candies array again and for each kid, check if the number of candies they have plus the extraCandies is greater than or equal to the maximum number of candies found in step 1.
3. If it is, add true to the result list; otherwise, add false.
Time Complexity: O(n) where n is the number of kids (length of the candies array).
Space Complexity: O(n) for the result list that stores the boolean values for each kid.

*/

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> list1 = new ArrayList<>();
        int max = 0;
        for(int i = 0; i<candies.length; i++){

            if(max < candies[i]){
                max = candies[i];
            }

        }
        int sum = 0;

        for(int i = 0;i<candies.length; i++ ){

            sum = candies[i] + extraCandies;
            if(sum >= max){
                list1.add(true);
            }
            else{
                list1.add(false);
            }

        }
        return list1;
    }
}
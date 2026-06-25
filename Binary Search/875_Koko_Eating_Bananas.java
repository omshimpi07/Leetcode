/*
Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.
Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead, and will not eat any more bananas during this hour.
Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.
Return the minimum integer k such that she can eat all the bananas within h hours.

Example 1: Input: piles = [3,6,7,11], h = 8 Output: 4
Example 2: Input: piles = [30,11,23,4,20], h = 5 Output: 30
Difficulty : medium

Approach : Binary Search.
1. Initialize two pointers, left and right, to 1 and the maximum number of bananas in any pile respectively.
2. While left is less than or equal to right:
    a. Calculate the mid value as the average of left and right, which represents the current eating speed k.
    b. Calculate the total hours needed to eat all the bananas at speed k by iterating through each pile and summing up the hours required for each pile (using ceiling division).
    c. If the total hours is less than or equal to h, it means Koko can finish eating at this speed, so we update the answer to mid and move the right pointer to mid - 1 to search for a potentially smaller valid k.
    d. If the total hours is greater than h, it means Koko cannot finish eating at this speed, so we move the left pointer to mid + 1 to search for a larger valid k.
3. Return the answer after the loop ends.

Time Complexity: O(n log m) where n is the number of piles and m is the 
maximum number of bananas in any pile, since we perform a binary search on the range of possible eating speeds and for each speed, we iterate through all piles to calculate the total hours.
Space Complexity: O(1) since we are using a constant amount of space.

*/

class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        

        int k = 0;
        int left = 1;
        int right = 0;
        for(int i = 0; i<piles.length;i++){
            if(right < piles[i]){
                right = piles[i];
            }
        }

        int ans = right;

        while(left <= right){

        int mid = left + (right - left) / 2;
        long hours = 0;

        for(int pile : piles){

            hours += (pile + mid - 1L) / mid;
            if(hours > h){
                break;
            }
        }
        if(hours <= h){
            ans = mid;
            right = mid - 1;
        }
        else{
            left = mid + 1;
        }
    }
    return ans;
    }
}
/*
605. Can Place Flowers
You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule.
Example 1: Input: flowerbed = [1,0,0,0,1], n = 1 Output: true
Example 2: Input: flowerbed = [1,0,0,0,1], n = 2 Output: false
Constraints:
1 <= flowerbed.length <= 2 * 104
flowerbed[i] is 0 or 1.
0 <= n <= flowerbed.length
Difficulty : easy
Approach:
1. Iterate through the flowerbed array and check for each plot if it is empty (0
) and if the adjacent plots are also empty (or if it is the first or last plot).
2. If a plot is found where a flower can be planted, mark it as planted (1) and increment the count of planted flowers.
3. If at any point the count of planted flowers reaches n, return true.
4. If the loop ends and the count of planted flowers is still less than n, return false.
Time Complexity: O(m) where m is the length of the flowerbed array.
Space Complexity: O(1) since we are modifying the input array in place and using only a constant amount of extra space for the count variable.

*/

class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        boolean can = false;
        int ncount = 0;
        int nl = flowerbed.length;      
        
        for(int i = 0; i<nl ; i++){
            if(flowerbed[i] == 0){

                if((i == 0 || flowerbed[i-1] == 0) && (i == nl - 1 || flowerbed[i +1] == 0)){

                    flowerbed[i] = 1;
                    ncount++;

                    if (ncount >= n) return true;
                }
            }
            
        }
        if(ncount >= n){
            can = true;
        }
        return can;
    }
}
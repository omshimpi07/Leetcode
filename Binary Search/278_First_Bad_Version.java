/*
278. First Bad Version
You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
Suppose you have n versions [1, 2, ..., n] and you want to
find out the first bad one, which causes all the following ones to be bad.      
You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.   

Example 1: Input: n = 5, bad = 4 Output: 4 Explanation: call isBadVersion(3) -> false call isBadVersion(5) -> true call isBadVersion(4) -> true Then 4 is the first bad version.

Difficulty : easy

Approach : Binary Search.
1. Initialize two pointers, left and right, to represent the range of versions to search.
2. While left is less than or equal to right, calculate the mid-point of the range.
3. Call the isBadVersion API with the mid-point version:    
    a. If the mid-point version is bad, update the answer to mid and move the right pointer to mid - 1 to search for earlier bad versions.  
    b. If the mid-point version is not bad, move the left pointer to mid + 1 to search for later bad versions.
4. Continue this process until the left pointer exceeds the right pointer. The answer will be the first bad version found.

Time Complexity: O(log n) where n is the number of versions, since we are performing a binary search.
Space Complexity: O(1) since we are using a constant amount of space.   

*/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        
        int left = 0;
        int right = n;
        int ans = n;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return ans;

    }
}
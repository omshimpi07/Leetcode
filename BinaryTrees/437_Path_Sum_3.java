/*
437. Path Sum III
Given the root of a binary tree and an integer targetSum, return the number of paths where the sum of the values along the path equals targetSum.
The path does not need to start or end at the root or a leaf, but it must go downwards (i.e., traveling only from parent nodes to child nodes).

Example 1: Input: root = [10,5,-3,3,2,null,11,3,-2,null,1], targetSum = 8 Output: 3 Explanation: The paths that sum to 8 are: 1. 5 -> 3 2. 5 -> 2 -> 1 3. -3 -> 11
Example 2: Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22 Output: 3 Explanation: The paths that sum to 22 are: 1. 5 -> 4 -> 11 -> 2 2. 5 -> 8 -> 4 -> 5 3. 4 -> 11 -> 7
Example 3: Input: root = [1,2,3], targetSum = 3 Output: 2 Explanation: The paths that sum to 3 are: 1. 1 -> 2 2. 3

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse the binary tree and for each node, we will check if there are any paths starting from that node that sum up to the targetSum.
2. We will define a helper function that takes a node and the remaining sum as parameters. This function will check if the current node's value is equal to the remaining sum. If it is, we will increment our count of valid paths.
3. We will then recursively call the helper function for the left and right children of the current node, passing the updated remaining sum (remainingSum - current node's value).
Time Complexity: O(n^2) in the worst case, where n is the number of nodes in the binary tree. This is because for each node, we may have to check all of its descendants.
Space Complexity: O(h) where h is the height of the binary tree, which is the maximum depth. In the worst case (a skewed tree), this can be O(n).
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    public int pathSum(TreeNode root, int targetSum) {
        
        if (root == null){
            return 0;
        }
    
        return countFrom(root, targetSum) + pathSum(root.left, targetSum) + pathSum(root.right , targetSum);

    }

    public int countFrom(TreeNode root,long remainingSum  ){

        if (root == null) {
            return 0;
        }
        int count = 0;

        if (root.val == remainingSum){
            count++;
        }

        count += countFrom(root.left, remainingSum - root.val);
        count += countFrom(root.right, remainingSum - root.val);

        return count;
    }
}
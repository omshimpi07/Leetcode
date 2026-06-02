/*
104. Maximum Depth of Binary Tree
Given the root of a binary tree, return its maximum depth.

The maximum depth of a binary tree is the number of nodes along the longest path from the root node down to the farthest leaf node.
Example 1: Input: root = [3,9,20,null,null,15,7] Output: 3
Example 2: Input: root = [1,null,2] Output: 2

Difficulty : easy

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse the binary tree and keep track of the current depth at each node.
2. We can maintain a variable to store the maximum depth encountered during the traversal.
3. For each node, we will recursively call the DFS function for its left and right children, incrementing the current depth by 1.
4. When we reach a leaf node (a node with no children), we will update the maximum depth if the current depth is greater than the previously recorded maximum depth.

Time Complexity: O(n) where n is the number of nodes in the binary tree, since we need to visit each node once.
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
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }
        int lefth = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(lefth , right) + 1;
    }
}









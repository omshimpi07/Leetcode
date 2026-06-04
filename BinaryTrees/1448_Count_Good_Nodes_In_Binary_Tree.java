/*
1448. Count Good Nodes in Binary Tree
Given a binary tree root, a node X in the tree is named good if in the path
from root to X there are no nodes with a value greater than X.
Return the number of good nodes in the binary tree.

Example 1: Input: root = [3,1,4,3,null,1,5] Output: 4
Explanation: Nodes in blue are good.
Root Node (3) is always a good node.
Node 4 -> (3,4) is the maximum value in the path starting from the root to this node is 4, hence it is a good node.
Node 5 -> (3,4,5) is the maximum value in the path starting from the root to this node is 5, hence it is a good node.
Node 3 -> (3,1,3) is the maximum value in the path starting from the root to this node is 3, hence it is a good node.

Example 2: Input: root = [3,3,null,4,2] Output: 3
Explanation: Node 2 -> (3,3,2) is not good, because "3" is higher than it.
Node 4 -> (3,3,4) is the maximum value in the path starting from the root to this node is 4, hence it is a good node.
Node 3 -> (3,3) is the maximum value in the path starting from the root to this node is 3, hence it is a good node.
Root Node (3) is always a good node.
Example 3: Input: root = [1] Output: 1
Explanation: Root Node (1) is the only node in the tree and is a good node.

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse the binary tree and keep track of the maximum value encountered along the path from the root to the current node.
2. We will define a helper function that takes a node and the maximum value encountered so far as parameters. This function will check if the current node's value is greater than or equal to the maximum value. If it is, we will increment our count of good nodes.
3. We will then update the maximum value if the current node's value is greater than the maximum value and recursively call the helper function for the left and right children of the current node, passing the updated maximum value.

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
    int count = 0;
    public int goodNodes(TreeNode root) {
        
        Preorder(root , root.val);
        return count;
    }
    public void Preorder(TreeNode root, int maxsofar){
            
        if(root == null){
            return ;
        } 
        if (root.val >= maxsofar){
            count++;
        }
        int newmax = Math.max(maxsofar, root.val);

        Preorder(root.left, newmax);
        Preorder(root.right, newmax);
    }
}
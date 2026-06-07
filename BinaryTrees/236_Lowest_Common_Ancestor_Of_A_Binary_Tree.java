/*
236. Lowest Common Ancestor of a Binary Tree
Given a binary tree, find the lowest common ancestor (LCA) of two given nodes in the tree.
According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1: Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 Output: 3 Explanation: The LCA of nodes 5 and 1 is 3.
Example 2: Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 Output: 5 Explanation: The LCA of nodes 5 and 4 is 5, since a node can be a descendant of itself according to the LCA definition. Example 3: Input: root = [1,2], p = 1, q = 2 Output: 1

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse the binary tree and for each node, we will check if it is equal to either p or q. If it is, we will return that node.
2. We will then recursively call the function on the left and right subtrees of the current node. If both calls return a non-null value, it means that p and q are found in different subtrees, and the current node is their lowest common ancestor (LCA). We will return the current node in this case.
3. If only one of the calls returns a non-null value, it means that both p and q are found in the same subtree, and we will return the non-null value.
Time Complexity: O(n) where n is the number of nodes in the binary tree, since we visit each node once.
Space Complexity: O(h) where h is the height of the binary tree, which is the maximum depth. In the worst case (a skewed tree), this can be O(n).

 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root == null){
            return null;
        }

        if(root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);

        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        if(left != null){
            return left;
        }

        return right;
    }

    
}
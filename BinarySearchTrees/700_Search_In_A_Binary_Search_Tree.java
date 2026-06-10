/*
700. Search in a Binary Search Tree

Given the root of a binary search tree (BST) and an integer val, find the node
in the BST that the node's value equals val and return the subtree rooted with that node. If such a node does not exist, return null.

Example 1: Input: root = [4,2,7,1,3], val = 2 Output: [2,1,3]

Example 2: Input: root = [4,2,7,1,3], val = 5 Output: []

Constraints:
The number of nodes in the tree is in the range [1, 5000].
1 <= Node.val <= 10^7
1 <= val <= 10^7

Difficulty: Easy

Approach:
1. We can take advantage of the properties of a binary search tree to efficiently search for the target value.
2. Starting from the root, we compare the target value with the current node's value. If they match, we return the current node. If the target value is less than the current node's value, we move to the left child; if it is greater, we move to the right child.
3. We continue this process until we find the target value or reach a null node, which indicates that the target value is not present in the tree.

Time Complexity: O(h) where h is the height of the binary search tree. In the worst case (a skewed tree), this can be O(n), and in the best case (a balanced tree), this can be O(log n).
Space Complexity: O(1) for the iterative approach, as we are not using any additional data structures that grow with the input size. If we were to use a recursive approach, the space complexity would be O(h) due to the call stack, where h is the height of the tree.

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
    public TreeNode searchBST(TreeNode root, int val) {
        
        while(root != null){

            if(root.val == val){
                return root;
            }
            else if(root.val < val ){
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        return null;
    }
}
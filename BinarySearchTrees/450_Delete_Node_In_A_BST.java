/*
450. Delete Node in a BST

Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.
Basically, the deletion can be divided into two stages:
1. Search for a node to remove.
2. If the node is found, delete the node.

Example 1: Input: root = [5,3,6,2,4,null,7], key = 3 Output: [5,4,6,2,null,null,7] Explanation: Given key to delete is 3. So we find the node with value 3 and delete it. One valid answer is [5,4,6,2,null,null,7], shown in the above BST. Please notice that another valid answer is [5,2,6,null,4,null,7], which represents the BST in the left figure below. Both of these answers are accepted.
Example 2: Input: root = [5,3,6,2,4,null,7], key = 0 Output: [5,3,6,2,4,null,7] Explanation: The tree does not contain a node with value = 0. No changes are made to the tree.
Example 3: Input: root = [], key = 0 Output: []

Constraints:
The number of nodes in the tree is in the range [0, 10^4].
-10^5 <= Node.val <= 10^5
-10^5 <= key <= 10^5

Difficulty: Medium

Approach:
1. We can use a recursive approach to delete a node from the binary search tree.
2. We start by searching for the node to delete. If the key is less than the current node's value, we recursively call the delete function on the left subtree. If the key is greater, we call it on the right subtree.
3. Once we find the node to delete, we have three cases to consider:
   a. If the node has no children, we can simply remove it by returning null.
   b. If the node has one child, we can replace the node with its child.
   c. If the node has two children, we need to find the in-order successor (the smallest node in the right subtree), replace the value of the current node with the successor's value, and then delete the successor node from the right subtree.

   Time Complexity: O(h) where h is the height of the binary search tree. In the worst case (a skewed tree), this can be O(n), and in the best case (a balanced tree), this can be O(log n).
Space Complexity: O(h) for the recursive call stack, where h is the height of the tree. In the worst case, this can be O(n) for a skewed tree, and in the best case, it can be O(log n) for a balanced tree.


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
    public TreeNode deleteNode(TreeNode root, int key) {
        
    if (root == null){
        return null;
    }
    if (key < root.val){
        root.left = deleteNode(root.left, key);
    }
    else if (key > root.val){
        root.right = deleteNode(root.right, key);
    }
    else {

        if (root.left == null){
            return root.right;
        }

        if (root.right == null){
            return root.left;
        }

        TreeNode successor = findMin(root.right);
        root.val = successor.val;
        root.right = deleteNode(root.right, successor.val);
    }

    return root;
    }
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}
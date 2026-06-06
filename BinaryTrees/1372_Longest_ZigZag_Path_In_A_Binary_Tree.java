/*
1372. Longest ZigZag Path in a Binary Tree
Given the root of a binary tree, return the length of the longest ZigZag path in the tree.
A ZigZag path for a binary tree is defined as follow:
Choose any node in the binary tree and a direction (right or left).
If the current direction is right, move to the right child of the current node; otherwise, move to the left child.
Change the direction from right to left or from left to right.
Repeat the second and third step until you can't move in the tree.

Example 1: Input: root = [1,null,1,1,1,null,null,null,1,null,null,null,1] Output: 3 Explanation: The longest ZigZag path in the tree is right -> left -> right.
Example 2: Input: root = [1,1,1,null,1,null,null,null,1,null,null,null,1] Output: 4 Explanation: The longest ZigZag path in the tree is left -> right -> left -> right.
Example 3: Input: root = [1] Output: 0 Explanation: There is no ZigZag path in the tree.

Difficulty : medium

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse the binary tree and for each node, we will check the longest ZigZag path starting from that node.
2. We will define a helper function that takes a node, a boolean indicating the direction we came from (left or right), and the current length of the ZigZag path as parameters. This function will update the maximum length of the ZigZag path found so far.
3. If we came from the left, we will try to move to the right child and increase the length of the path by 1, and also try to move to the left child but reset the length to 1. If we came from the right, we will do the opposite.
Time Complexity: O(n) where n is the number of nodes in the binary tree, since we visit each node once.
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
    
    int maxlength = 0;
    
    public int longestZigZag(TreeNode root) {

        if(root == null){
            return 0;
        }

        zigzag(root.left, true, 1);
        zigzag(root.right, false, 1);

        return maxlength;
    }
    
    public void zigzag(TreeNode root , boolean CameFromLeft , int length){

        if(root == null){
            return ;
        }
        maxlength = Math.max(maxlength, length);

        if(CameFromLeft){
            zigzag(root.right, false, length + 1);
            zigzag(root.left, true, 1);
        }
        else{
            zigzag(root.left, true, length + 1);
            zigzag(root.right, false, 1);
        }

    }
}
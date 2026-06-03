/*
872. Leaf-Similar Trees
Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.
Two binary trees are considered leaf-similar if their leaf value sequence is the same.
Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

Example 1:
Input: root1 = [3,5,1,6,2,9,8,null,null,7,4], root2 = [3,5,1,6,7,4,2,null,null,null,null,null,null,null,null]
Output: true
Example 2:
Input: root1 = [1,2,3], root2 = [1,3,2]
Output: false

Difficulty : easy

Approach : Depth First Search (DFS).
1. We can use a depth-first search (DFS) approach to traverse both binary trees and collect the values of the leaf nodes in a list.
2. We will define a helper function that takes a node and a list as parameters. This function will check if the current node is a leaf node (i.e., it has no left or right children). If it is a leaf node, we will add its value to the list.
3. We will call this helper function for both root1 and root2, passing in separate lists to collect the leaf values.
4. After collecting the leaf values for both trees, we will compare the two lists. If they are equal, it means the trees are leaf-similar, and we will return true. Otherwise, we will return false.
Time Complexity: O(n) where n is the number of nodes in the larger of the two binary trees, since we need to visit each node once to collect the leaf values.
Space Complexity: O(m) where m is the number of leaf nodes in the larger of the two binary trees, since we need to store the leaf values in a list. In the worst case (a skewed tree), this can be O(n).

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
     public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        collectLeaves(root1, list1);
        collectLeaves(root2, list2);

        return list1.equals(list2);
    }

    public void collectLeaves(TreeNode node, ArrayList<Integer> list){

        if(node == null){
            return;
        }
        if(node.left == null && node.right == null){
            list.add(node.val);
            return;
        }

        collectLeaves(node.left, list);
        collectLeaves(node.right, list);
    }

}
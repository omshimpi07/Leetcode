/*
206. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list.
Example 1: Input: head = [1,2,3,4,5] Output: [5,4,3,2,1]
Example 2: Input: head = [1,2] Output: [2,1]
Difficulty : easy
Approach : Iterative.
1. Initialize three pointers: prev as null, curr as head, and next as null.
2. Iterate through the linked list until curr is null:
   a. Store the next node (curr.next) in the next pointer.
   b. Reverse the current node's pointer by setting curr.next to prev.
   c. Move the prev pointer to the current node (prev = curr).
   d. Move the curr pointer to the next node (curr = next).
3. After the loop, prev will be pointing to the new head of the reversed linked list. Return prev.
Time Complexity: O(n) where n is the number of nodes in the linked list, since we need to traverse the list once.
Space Complexity: O(1) since we are using only a constant amount of extra space for the pointers.

*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){

            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;

    }
}
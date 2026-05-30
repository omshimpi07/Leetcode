/*
328. Odd Even Linked List
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.
The first node is considered odd, and the second node is even, and so on.

Example 1: Input: head = [1,2,3,4,5] Output: [1,3,5,2,4]
Example 2: Input: head = [2,1,3,5,6,4,7] Output: [2,3,6,7,1,5,4]

Difficulty : medium

Approach : Two Pointers.
1. Use two pointers, odd and even, to keep track of the current nodes in the odd and even positions, respectively. Also, keep a reference to the head of the even list (evenHead) to connect it later.
2. Traverse the linked list using the odd and even pointers. For each iteration:
   a. Connect the odd pointer to the next odd node (odd.next = odd.next.next) and move the odd pointer to the next odd node.
   b. Connect the even pointer to the next even node (even.next = even.next.next) and move the even pointer to the next even node.
3. After the loop, connect the last odd node to the head of the even list (odd.next = evenHead) to complete the reordering.
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
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while(even != null && even.next != null){
            
            odd.next = odd.next.next;
            odd = odd.next;
        
            even.next = even.next.next;
            even = even.next;

        }
        odd.next = evenHead;
        
        return head;
    }
}
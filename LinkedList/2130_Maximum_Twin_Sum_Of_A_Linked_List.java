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
    public int pairSum(ListNode head) {
        
        Stack<Integer> S = new Stack<>();
        int n = 0;
        ListNode temp = head;

        while(temp != null){
            n++;
            temp = temp.next;
        }
        ListNode curr = head;

        for(int i = 0; i<n/2 ; i++){

            S.push(curr.val);
            curr = curr.next;
        }
        int sum = 0;
        int maxsum = 0;
        for(int i = n/2 ; i<n ; i++){

            sum = S.pop() + curr.val;
            maxsum =Math.max(maxsum , sum);
            curr = curr.next;
        }
        return maxsum;

    }
}

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
    public int pairSum(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while(curr != null){
            next = curr.next;

            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode first = head;
        ListNode second = prev;
        int max = 0;
        while(second != null){
            int sum = first.val + second.val; 
            max = Math.max(sum , max);
            first = first.next;
            second = second.next;
        }
        return max;
    }
}
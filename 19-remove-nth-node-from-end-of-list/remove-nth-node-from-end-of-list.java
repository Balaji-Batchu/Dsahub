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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head.next == null) return head.next;

        ListNode first = head, second = head;

        for(int index = 0; index < n; index ++){
            // if(second.next != null) 
                second = second.next;
        }

        if(second == null){
            return head.next;
        }

        while(second != null && second.next != null){
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;

        return head;
    }
}
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        ListNode start = head, end = head;

        while(end != null){
            for(int x = 1; x < k; x ++){
                if(end!= null) end = end.next;
            }

            if(end != null)System.out.println("Ended at: " + end.val);

            if(end != null){
                ListNode nxt = end.next;
                end.next = null;
                end = nxt;
                ListNode temp = start;
                start = end;
                ListNode reversed = reverse(temp);
                ptr.next = reversed;
                while(ptr.next != null) ptr = ptr.next;
            }
        }

        ptr.next = start;

        return dummy.next;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
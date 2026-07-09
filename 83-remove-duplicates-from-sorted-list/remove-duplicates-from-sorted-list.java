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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;

        while(p2 != null) {
            while(p2 != null && p2.val == p1.val){
                p2 = p2.next;
            }
            p1.next = p2;
            p1 = p1.next;
        }

        return head;
    }
}
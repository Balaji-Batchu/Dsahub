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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        while(carry != 0 || l1 != null || l2 != null){
            carry += (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0);
            curr.next = new ListNode(carry % 10);
            curr = curr.next;
            carry = carry / 10;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return temp.next;
    }
}
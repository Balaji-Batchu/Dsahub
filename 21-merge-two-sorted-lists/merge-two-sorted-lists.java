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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;

        ListNode ptr1 = list1, ptr2 = list2;

        while(ptr1 != null || ptr2 != null){
            int f = ptr1 == null ? Integer.MAX_VALUE : ptr1.val;
            int s = ptr2 == null ? Integer.MAX_VALUE : ptr2.val;

            System.out.println("f: " + f + " s:" + s);
            if(f <= s){
                ans.next = new ListNode(f);
                ans = ans.next;
                ptr1 = ptr1.next;
            }
            else{
                ans.next = new ListNode(s);
                ans = ans.next;
                ptr2 = ptr2.next;
            }
        }

        return dummy.next;
    }
}
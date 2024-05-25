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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return head;

        int n = 1;
        ListNode temp = head;

        while(temp.next != null){
            n ++;
            temp = temp.next;
        }
        temp.next = head;

        k = k % n;

        int steps = n - k;
        while(steps > 0){
            temp = temp.next;
            steps --;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}
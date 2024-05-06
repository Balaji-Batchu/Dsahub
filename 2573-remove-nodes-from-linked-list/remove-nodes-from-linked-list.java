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
    public ListNode removeNodes(ListNode head) {
        ListNode temp = head;
        Stack<Integer> s = new Stack<>();

        while(temp != null){
            while(s.size() != 0 && temp.val > s.peek()){
                s.pop();
            }
            
            s.push(temp.val);
            temp = temp.next;
        }

        Collections.reverse(s);
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(!s.isEmpty()){
            curr.next = new ListNode(s.pop());
            curr = curr.next;
        }

        return dummy.next;
    }
}
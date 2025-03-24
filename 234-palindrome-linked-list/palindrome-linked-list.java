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
    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode start = head;

        while(start != slow) {
            st.add(start);
            start = start.next;
        }

        if(fast != null && fast.next == null)
            st.add(slow);

        System.out.println(st);
        while(slow != null){
            ListNode temp = st.pop();
            if(temp.val != slow.val){
                System.out.println("checking: " + temp.val + " curr: " + slow.val);
                return false;
            } 

            slow = slow.next;
        }

        return true;
    }
}
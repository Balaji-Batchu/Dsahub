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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int[] ans = new int[]{-1,-1};
        int firstFound = -1;
        int latestFound = -1;

        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;

        ListNode cp = head.next;
        ListNode fp = head;
        ListNode lp = cp.next;
        int cpIndex = 1;

        while(head != null && lp != null) {
            if((fp.val > cp.val && cp.val < lp.val) 
                || fp.val < cp.val && cp.val > lp.val) {
                
                if(firstFound == -1) {
                    firstFound = cpIndex;
                }
                else {
                    if(firstFound != -1) maxVal = Math.max(maxVal, cpIndex - firstFound);
                    if(latestFound != -1) minVal = Math.min(minVal, cpIndex - latestFound);
                    else minVal = maxVal;
                    latestFound = cpIndex;
                }
            }

            fp = cp;
            cp = lp;
            lp = lp.next;

            cpIndex ++;
        }

        if(latestFound == -1) return new int[]{-1,-1};
        else return new int[]{minVal, maxVal};
    }
}
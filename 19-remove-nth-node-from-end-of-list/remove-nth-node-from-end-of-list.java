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
        int si = 0;
        ListNode temp = head;

        while(temp != null) {
            temp = temp.next;
            si++;
        }

        if(si == n) return head.next;

        int r = si - n+1;
        int i = 1;
        temp = head;

        while(i < r-1){
            i++;
            temp = temp.next;
        }

        if(n == 1) temp.next = null;
        else temp.next = temp.next.next;

        return head;

    }
}
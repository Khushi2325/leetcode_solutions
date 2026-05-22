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
        if(head == null) return null;
        ListNode temp = head;

        for(int i = 0;i<k;i++){
            if(temp == null) return head;

            temp = temp.next;
        }

        ListNode nhead = reverse(head, temp);
        head.next = reverseKGroup(temp, k);
        return nhead;
        
    }

    public ListNode reverse(ListNode cur, ListNode end){
        ListNode pre = null;

        while(cur != end){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }
}
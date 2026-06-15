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
    public ListNode deleteMiddle(ListNode head) {
        ListNode pre = head;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if(pre.next == null) return null;

        if(fast.next == null){
            pre.next = pre.next.next;
        }else{
            slow.next = slow.next.next;
        }

        return head;
    }
}
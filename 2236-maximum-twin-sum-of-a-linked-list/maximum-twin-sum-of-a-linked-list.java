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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next.next != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode h2 = slow.next;
        slow.next = null;

        h2 = reverse(h2);
        ListNode h1 = head;

        int max = Integer.MIN_VALUE;

        while(h1 != null && h2 != null){
            int a = h1.val + h2.val;

            max = Math.max(a, max);
            h1 = h1.next;
            h2 = h2.next;
        }

        return max;

        
    }
}
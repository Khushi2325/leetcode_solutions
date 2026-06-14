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
        ListNode h1 = l1;
        ListNode h2 = l2;

        ListNode li = new ListNode(-1);
        ListNode temp = li;
        int carry = 0;

        while(h1 != null && h2 != null){
            int a = h1.val + h2.val + carry;

            if(a < 10){
                temp.next = new ListNode(a);
                carry = 0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(a % 10);
                carry = a/10;
                temp = temp.next;
            }

            h1 = h1.next;
            h2 = h2.next;
        }

        while(h1 != null){
            int a = h1.val + carry;
            if(a < 10){
                temp.next = new ListNode(a);
                carry = 0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(a % 10);
                carry = a/10;
                temp = temp.next;
            }

            h1 = h1.next;
        }

        while(h2 != null){
            int a = h2.val + carry;
            if(a < 10){
                temp.next = new ListNode(a);
                carry = 0;
                temp = temp.next;
            }else{
                temp.next = new ListNode(a % 10);
                carry = a/10;
                temp = temp.next;
            }

            h2 = h2.next;
        }

        if(carry != 0) temp.next = new ListNode(carry);

        return li.next;
    }
}
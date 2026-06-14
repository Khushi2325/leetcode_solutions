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
        ListNode li = new ListNode(-1);
        ListNode l1 = list1;
        ListNode l2 = list2;

        ListNode t = li;

        if(l1 == null) return l2;
        if(l2 == null) return l1;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                t.next = l1;
                l1 = l1.next;
            }else{
                t.next = l2;
                l2 = l2.next;
            }

            t = t.next;
        }

        if(l1 != null) t.next = l1;
        if(l2 != null) t.next = l2;

        return li.next;
    }
}
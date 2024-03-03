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
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;

        for(int i=1;i<=n;i++)
        {
            first = first.next;
        }

        while(first.next!=null)
        {
            second=second.next;
            first=first.next;
        }

        second.next=second.next.next;

        return dummy.next;
        
        
    }
}
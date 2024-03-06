/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        //retry this again


        if(head==null)
        return false;
        ListNode fast=new ListNode();
        ListNode slow=new ListNode();
        fast=head;
        slow=head;

        

        while(fast!=null && fast.next!=null )
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;
        }

        return false;
        
    }
}
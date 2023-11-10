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
    public ListNode reverseList(ListNode head) {

      ListNode curr=null;
      ListNode forward=null;
      ListNode prev=null;

      if(head==null)
      {
        return curr;
      }
      curr=head;
      while(curr!=null)
      {
        forward = curr.next;
        curr.next = prev;
        prev = curr;
        curr = forward;
      }
      return prev;
        
    }
}
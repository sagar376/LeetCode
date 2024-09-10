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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode prev = head;
        ListNode curr = head;

        while(curr.next != null)
        {
            curr = curr.next;
            ListNode newNode = new ListNode();
            newNode.val = GCD(prev.val,curr.val);
            prev.next = newNode;
            newNode.next = curr;
            prev = curr;
        }

        return head;
        
    }

    private int GCD(int a,int b)
    {
        int min = Math.min(a, b);
        while(min > 0)
        {
            if((a % min == 0 && b % min ==0))
            break;
            else
            min--;
        }
        return min;
    }

}
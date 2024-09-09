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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        // count number of nodes in LL
        ListNode current = head;
        int size = 0;
        while(current != null)
        {
            current = current.next;
            size++;
        }

        current = head;
        ListNode prev = null;
        int splitSize = size/k;
        int remainingParts = size % k;

        for(int i = 0; i < k; i++)
        {
            ListNode newNode = current;
            int currentSize = splitSize;
            if(remainingParts > 0)
            {
                currentSize++;
                remainingParts--;
            }

            int j = 0;
            while(j < currentSize)
            {   
                prev = current;
                current = current.next;
                j++;
            }
            if(prev != null)
            {
                prev.next = null;
            }
            result[i] = newNode;
        }
        return result;
        
    }
}
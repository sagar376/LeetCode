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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        int count=0;
        ListNode dummy=list1;
        while(count!=a-1)
        {
            dummy=dummy.next;
            count++;
        }
        ListNode break1=dummy;
        
        while(count!=b+1)
        {
            dummy=dummy.next;
            count++;
        }

        ListNode break2=dummy;

        break1.next=list2;
        
        while(list2.next!=null)
        {
            list2=list2.next;
        }
        list2.next=break2;


        return list1;
        
    }
}
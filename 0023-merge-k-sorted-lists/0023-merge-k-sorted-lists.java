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
    public ListNode mergeKLists(ListNode[] lists) {
        
        int size = lists.length;
        int interval =1;
        
        while(interval < size)
        {
            for(int i=0;i<size-interval;i+=interval*2)
            {
                lists[i]=merge(lists[i],lists[i+interval]);
            }
            interval*=2;
        }
        
        
        return size>0?lists[0]:null;
        
    }
    
    
    public ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode answer= new ListNode(0);
        ListNode temp=answer;
        
        while(l1!=null && l2!=null)
        {
            if(l1.val>=l2.val)
            {
                temp.next=l2;  
                l2=l2.next;
            }
            else
            {
                temp.next=l1;
                l1=l1.next;
            }
            temp=temp.next;
        }
        temp.next = l1!=null?l1:l2;
        
        return answer.next;
        
    }
}
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
        
        ListNode l3=new ListNode(0);
        ListNode temp=l3;
        
        int carry=0;
        int sum=0;
        
        while(l1!=null || l2!=null)
        {
            sum = carry+(l1!=null?l1.val:0)+(l2!=null?l2.val:0);
            
            carry = sum/10;
            int remainder = sum %10;
            
            ListNode newNode=new ListNode(remainder);
            temp.next=newNode;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            temp=temp.next;
        }
        if(carry>0){
            ListNode newNode=new ListNode(carry);
            temp.next=newNode;
        }
        return l3.next;
        
    }
}
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
    public ListNode removeNodes(ListNode head) {
        if (head == null) return null;

        Stack<ListNode> st=new Stack<ListNode>();
        ListNode curr=head;

        st.push(curr);

        while(curr.next!=null)
        {
            if(st.peek().val>=curr.next.val)
            {
                st.push(curr.next);
            }
            else
            {
                while(!st.isEmpty() && st.peek().val<curr.next.val)
                {
                    st.pop();
                }
                st.push(curr.next);
               
            }
            curr=curr.next;
        }

        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        while(!st.isEmpty())
        {
            ListNode nextNode=st.pop();
            ans.next=nextNode;
            ans=ans.next;
        }
        ans.next=null;

        ListNode prev=null;
        ListNode cur=dummy.next;
        ListNode nex=null;

        while(cur!=null)
        {
            nex=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nex;    
        }

        return prev;

        
    }
}
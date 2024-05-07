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
    public ListNode doubleIt(ListNode head) {
        ListNode head1=new ListNode(0);
        head1.next=head;

        ListNode left=head1;
        ListNode right=head;

        while(right!=null)
        {
            int val=right.val*2;
            if(val>9)
            {
                left.val+=val/10;
            }
            right.val=val%10;
            right=right.next;
            left=left.next;
        }

        return head1.val==0?head:head1;

    }
}

//         ListNode prev=reverseList(head);

//         ListNode dummy=prev;
//         ListNode newHead=null;
//         int carry=0;
//         while(dummy!=null)
//         {
//             int newValue=dummy.val*2+carry;
//             dummy.val=newValue%10;

//             carry=newValue>9?1:0;

//             newHead=dummy;
//             dummy=dummy.next;
//         }

//         if(carry!=0)
//         {
//             ListNode extraNode=new ListNode(carry);
//             newHead.next=extraNode;
//         }


//         return reverseList(prev);




        
//     }


//     private ListNode reverseList(ListNode node)
//     {
//         ListNode curr=node;
//         ListNode prev=null;
//         ListNode next=null;

//         while(curr!=null)
//         {
//             next=curr.next;
//             curr.next=prev;
//             prev=curr;
//             curr=next;
//         }

//         return prev;

//     }
// }
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
//         Node cur=head;
//         HashMap<Node,Node> hp=new HashMap<>();
        
//         while(cur!=null)
//         {
//             hp.put(cur,new Node(cur.val));
//             cur=cur.next;
//         }
        
//         cur = head;
        
//         while(cur!=null)
//         {
//             hp.get(cur).next=hp.get(cur.next);
//             hp.get(cur).random=hp.get(cur.random);
//             cur=cur.next;
//         }
//         return hp.get(head);
        Node iter = head;
        Node front =head;
        Node copy;
        
        //step-1 //insert new copynodes in between
        while(iter!=null)
        {
            front = iter.next;
            copy=new Node(iter.val);
            iter.next=copy;
            copy.next=front;
            iter = front;
        }
        
        //step -2  // add random pointer or copy nodes
        iter=head;
        while(iter!=null)
        {
            if(iter.random!= null)
            {
                //iter.next.random=null;
                iter.next.random=iter.random.next;
            }
            else{
                //iter.next.random=null;
            }
            
            iter=iter.next.next;
        }
        
        //step - 3 // break the original and copy nodes and connect back copy and original node's link
        Node dummy=new Node(0);
        iter=head;
        front=head;
        Node copy1=dummy;
        
        while(iter!=null && front!=null)
        {
            front=iter.next.next;
            copy1.next=iter.next;
            iter.next=front;
            copy1=copy1.next;
            iter=front;
        }
        
        
        
        return dummy.next;
        
        
        
    }
}
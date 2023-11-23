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
        
        Node cur=head;
        HashMap<Node,Node> hp=new HashMap<>();
        
        while(cur!=null)
        {
            hp.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        
        cur = head;
        
        while(cur!=null)
        {
            hp.get(cur).next=hp.get(cur.next);
            hp.get(cur).random=hp.get(cur.random);
            cur=cur.next;
        }
        return hp.get(head);
      
    }
}
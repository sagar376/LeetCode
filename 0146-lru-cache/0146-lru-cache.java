class LRUCache {
    int capacity;
    HashMap<Integer,Node> cache;
    
    Node left,right;
    
    public LRUCache(int capacity) {
        this.capacity=capacity;
        cache = new HashMap<>();
        
         left=new Node(0,0);
         right=new Node(0,0); 
        
        
        left.next = right;
        right.prev = left;   
        
    }
    
    public int get(int key) {
        if(cache.containsKey(key))
        {
            remove(cache.get(key));
            insert(cache.get(key));
            return cache.get(key).val;
        }
        return -1;
        
    }
    
    public void put(int key, int value) {
        
        if(cache.containsKey(key))
        {
            remove(cache.get(key));
        }
        cache.put(key,new Node(key,value));
        insert(cache.get(key));
        if(cache.size()>capacity)
        {
            // remove(left.next);
            // cache.remove(key);
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }      
    }
    public void remove(Node node)
    {
        Node next=node.next;
        Node prev=node.prev;
        
        prev.next=next;
        next.prev=prev;
        
    }
    public void insert(Node node){
        Node next=right;
        Node prev=right.prev;
        
        prev.next=node;
        next.prev=node;
        
        node.next=next;
        node.prev=prev;
        
    }
}

class Node{
    int key;
    int val;
    
    Node next;
    Node prev;
    
    Node(int key,int val)
    {
        this.key = key;
        this.val= val;
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
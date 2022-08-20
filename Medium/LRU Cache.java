class LRUCache {
    int capacity;
    HashMap<Integer,Node>map;
     Node right=new Node(0,0);
     Node left=new Node(0,0);
    public LRUCache(int capacity) {
     this.capacity=capacity;
     this.map=new HashMap();
     this.left.next=right;
     this.right.prev=left;   
    }
    public void remove(Node node){
        Node p=node.prev;
        Node n=node.next;
        p.next=n;
        n.prev=p;
    }
    public void insert(Node node)
    {
        Node p=this.right.prev;
        Node n=this.right;
        n.prev=node;
        p.next=node;
        node.next=n;
        node.prev=p;
    }
    public int get(int key) {
        if(map.containsKey(key))
        {   this.remove(map.get(key));
            this.insert(map.get(key));
            return map.get(key).val;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            this.remove(map.get(key));
        }
        map.put(key,new Node(key,value));
        this.insert(map.get(key));
        if(map.size()>capacity)
        {
            Node lru=this.left.next;
            this.remove(lru);
            map.remove(lru.key);
        }
    }
}
class Node{
    Node next,prev;
    int key,val;
    public Node(int key,int val)
    {
        this.key=key;
        this.val=val;
        this.next=null;
        this.prev=null;
    }
}
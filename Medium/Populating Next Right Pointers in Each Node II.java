class Solution {
    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty())
        {
            int k=q.size();
            Node temp=q.poll();
            for(int i=0;i<k;i++)
            {   
                if(temp.left!=null)
                {  
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
                if(i==k-1)
                {
                    temp.next=null;
                    break;
                }
                else{
                    temp.next=q.poll();
                    temp=temp.next;
                }
            }
        }
        return root;
    }
}
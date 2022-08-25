class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        int ans=1;
        Queue<TreeNode>q=new LinkedList();
        q.offer(root);
        int k=1;
        while(!q.isEmpty())
        {   
            int k2=0;
            while(k>0)
            {
                TreeNode temp=q.poll();
                if(temp.right==null&&temp.left==null)
                    return ans;
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                    k2++;
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                    k2++;
                }
                k--;
            }
            k=k2;
            ans++;
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> q=new LinkedList();
        List<List<Integer>>ans=new ArrayList();
        if(root==null)
            return ans;
        q.offer(root);
        int k=1;
        while(!q.isEmpty())
        {
            int k2=0;
            ArrayList<Integer>t=new ArrayList();
            while(k>0)
            {   TreeNode temp=q.poll();
                t.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                    k2++;}
                if(temp.right!=null){
                    q.offer(temp.right);
                    k2++;
                }
                k--;
            }
            k=k2;
            ans.add(t);
        }
        Collections.reverse(ans);
        return ans;
    }
}
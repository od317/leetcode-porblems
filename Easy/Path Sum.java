class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return find(root,0,targetSum);
    }
    public boolean find(TreeNode root,int s,int t)
    {
        if(root==null)
            return false;
        s+=root.val;
        if(root.left==null&&root.right==null)
        {return (s==t)? true:false;}
        return find(root.left,s,t)||find(root.right,s,t);
    }
}
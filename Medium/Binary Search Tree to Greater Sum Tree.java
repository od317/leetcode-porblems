class Solution {
    int max=0;
     public TreeNode bstToGst(TreeNode root) {
       find(root);
        return root;
    }
    public void find(TreeNode root)
    {
        if(root==null)
            return;
        find(root.right);
        root.val+=max;
        max=root.val;
        find(root.left);
    }
}
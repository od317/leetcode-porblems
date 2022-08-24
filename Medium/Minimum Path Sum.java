class Solution {
    public int minPathSum(int[][] grid) {
        int l1=grid.length;
        int l2=grid[0].length;
        int res[][]=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        for(int j=0;j<=l2;j++)
        res[i][j]=Integer.MAX_VALUE;
        res[l1-1][l2]=0;
        for(int i=l1-1;i>=0;i--)
        {
            for(int j=l2-1;j>=0;j--)
            {
                res[i][j]=grid[i][j]+Math.min(res[i+1][j],res[i][j+1]);
            }
        }
        return res[0][0];
        
    }
}
public int longestIncreasingPath(int[][] matrix) {
        int ans=0;
        int l1=matrix.length,l2=matrix[0].length;       
        int mat[][]=new int[l1][l2];
        boolean vis[][]=new boolean[l1][l2];
        for(int i=0;i<l1;i++)
        {   int temp=0;
            for(int j=0;j<l2;j++)
            {
                if(vis[i][j])
                    temp=mat[i][j];
                else
                {
                    find(i,j,l1,l2,matrix,vis,mat,-1);
                    temp=mat[i][j];
                }
                ans=Math.max(ans,temp);
            }
        }
        return ans;
    }
    public int find(int i,int j,int l1,int l2,int[][]matrix,boolean[][]vis,int[][]mat,int c)
    {
        if(i>=l1||j>=l2||i<0||j<0||(c!=-1&&matrix[i][j]<=c))
            return 0;
        if(vis[i][j])
            return mat[i][j];
        vis[i][j]=true;
        int left=find(i-1,j,l1,l2,matrix,vis,mat,matrix[i][j]);
        int right=find(i+1,j,l1,l2,matrix,vis,mat,matrix[i][j]);
        int up=find(i,j+1,l1,l2,matrix,vis,mat,matrix[i][j]);
        int down=find(i,j-1,l1,l2,matrix,vis,mat,matrix[i][j]);
        int ans=Math.max(Math.max(left,right),Math.max(up,down));
        mat[i][j]=ans+1;
        return ans+1;
    }
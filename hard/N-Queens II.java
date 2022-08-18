class Solution {
    int ans[]=new int[1];
    public int totalNQueens(int n) {
        find(0,n,new HashSet(),new HashSet(),new HashSet());
        return ans[0];
    }
    public void find(int r,int n,HashSet<Integer>s,HashSet<Integer>d,HashSet<Integer>nd)
    {
        if(r>=n)
        {
            ans[0]+=1;
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(s.contains(i)||d.contains(r+i)||nd.contains(r-i))
                continue;
            s.add(i);
            d.add(r+i);
            nd.add(r-i);
            find(r+1,n,s,d,nd);
            s.remove(i);
            d.remove(r+i);
            nd.remove(r-i);
        }
    }
}
class Solution {
    Set<Integer>c=new HashSet();
    Set<Integer>d=new HashSet();
    Set<Integer>nd=new HashSet();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new LinkedList();
        dfs(0,n,ans,new LinkedList<String>());
        return ans;
    }
    public void dfs(int r,int n,List<List<String>>ans,List<String> list){
        if(r==n)
        {   ans.add(new LinkedList(list));
            return;
        }
        for(int i=0;i<n;i++)
        {
            if(c.contains(i)||d.contains(i+r)||nd.contains(r-i))
               continue;
            char[] s=new char[n];
            Arrays.fill(s,'.');
            s[i]='Q';
            String tos=new String(s);   
            list.add(tos);
            c.add(i);
            d.add(r+i);
            nd.add(r-i);
            dfs(r+1,n,ans,list);
            list.remove(tos);
            c.remove((Integer)i);
            d.remove((Integer)r+i);
            nd.remove((Integer)r-i);   
        } 
    }
}
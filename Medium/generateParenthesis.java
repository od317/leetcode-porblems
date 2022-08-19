  public List<String> generateParenthesis(int n) {
        List<String> ans =new ArrayList();
      find(ans,n,new String(),n,0);
      return ans;
    }
  public void find(List<String>ans,int n,String temp,int l,int r)
    {
    if(temp.length()==n*2)
      {
      ans.add(new String(temp));
              return;
      }
    if(l>0)
      {
      temp+='(';
      find(ans,n,temp,l-1,r+1);
     temp= temp.substring(0,temp.length()-1);
      }
    if(r>0)
      {
      temp+=')';
      find(ans,n,temp,l,r-1);
      temp=temp.substring(0,temp.length()-1);
      
      }
    }
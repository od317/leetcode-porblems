class Solution {
    public List<String> letterCombinations(String digits) {
          List<String> ans=new LinkedList();
        if(digits.length()==0)
            return ans;
        char[][] chars={{'a','b','c'},{'d','e','f'},{'g','h','i'},
                          {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                          {'t','u','v'},{'w','x','y','z'}};
        int l=digits.length();
        find(ans,digits,chars,0,new String(),l);
        return ans;
    }
    public void find(List<String> ans,String d,char[][]chars,int i,String temp,int l)
    {
        if(i>=l)
        {
            ans.add(new String(temp));
                return;
        }
        int c=Integer.parseInt(String.valueOf(d.charAt(i)))-2;
        for(int j=0;j<chars[c].length;j++)
        {
            temp+=chars[c][j];
            find(ans,d,chars,i+1,temp,l);
            temp=temp.substring(0,temp.length()-1);
        }
    }
}
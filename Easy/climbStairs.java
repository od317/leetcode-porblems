 class Solution {
    public int climbStairs(int n) {
    int a[]=new int[n+1];
        Arrays.fill(a,-1);
        a[0]=1;
        return find(n,a);
    }
    public int find(int n,int a[])
    {
      if(n==0)
         return a[n];
        if(n<0)
            return 0;
        if(a[n]!=-1)
          return a[n];
        a[n]=find(n-1,a)+find(n-2,a);
        return a[n];
    }
}
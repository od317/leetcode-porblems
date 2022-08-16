 public int maxArea(int[] h) {
        int length=h.length,ans=0,l=0,r=length-1;
        int maxl=h[0],maxr=h[r];
     while(l<r)
     {    maxl=h[l];maxr=h[r];
         int min=Math.min(maxl,maxr);
         ans=Math.max(ans,min*(r-l));
         if(maxl>maxr)
             r--;
         else
             l++;
     }
        return ans;
    } 
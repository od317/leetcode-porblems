   public int[] productExceptSelf(int[] nums) {
        int l=nums.length;
        int  ans[]=new int[l];
        int po=1;
        for(int i=0;i<l;i++)
        {
            ans[i]=po;
            po*=nums[i];
        }
        int pre=1;
        for(int i=l-1;i>=0;i--)
        {
            ans[i]*=pre;
            pre*=nums[i];
        }
        return ans;
    }
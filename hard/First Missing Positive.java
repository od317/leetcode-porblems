 public int firstMissingPositive(int[] nums) {
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(nums[i]<0)
                nums[i]=0;
        }
        for(int i=0;i<l;i++)
        {   int val=Math.abs(nums[i]);
            if(val>0&&val-1<l&&nums[val-1]>=0)
            {  
                if(nums[val-1]==0)
                nums[val-1]=(-1)*(l+1);
                else
                nums[val-1]*=(-1);
            }
        }
        for(int i=1;i<=l;i++)
        if(nums[i-1]>=0)
            return i;
        return l+1;
    }
class Solution {
    public int rob(int[] nums) {
     int ans1=0,ans2=0;
        int rob1=0,rob2=0;
        for(int i=1;i<nums.length;i++)
        {
            int temp=Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=temp;
        }
        ans1=rob2;
        rob1=0;rob2=0;
        for(int i=0;i<nums.length-1;i++)
        {
            int temp=Math.max(rob1+nums[i],rob2);
            rob1=rob2;
            rob2=temp;
        }
        ans2=rob2;
        return Math.max(ans1,Math.max(ans2,nums[0]));
    }
}
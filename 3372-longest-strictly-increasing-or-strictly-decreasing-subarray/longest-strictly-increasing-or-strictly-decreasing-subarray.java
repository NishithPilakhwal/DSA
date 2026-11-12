class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incwease=1;
        int decwease=1;
     int max=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]>nums[i+1])
            {
                decwease++;
                incwease=1;
            }
            else if(nums[i]<nums[i+1])
            {
                incwease++;
                decwease=1;
            }
            else
            {
                incwease=1;
                decwease=1;
            }
            max=Math.max(max,Math.max(incwease,decwease));


        }
        return max;
    


    }
}
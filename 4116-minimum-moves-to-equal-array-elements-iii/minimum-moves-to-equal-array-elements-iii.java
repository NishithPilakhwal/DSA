class Solution {
    public int minMoves(int[] nums) {
        int max = nums[0];
        int st=0;
        for(int i =1;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max = nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=max)
            {
                if(nums[i]<max)
                {
                    nums[i]++;
                    st++;
                }
                
            }

            
        }
        return st;
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pr=1;
        int pr2=1;
        int n =nums.length;
        int ans[] = new int[n];
        int c=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                pr2= pr2*nums[i];
c++;
                
            }
            else
            {
            pr2=pr2*nums[i];

            
pr =pr*nums[i];
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if(c>1)
            {
ans[i]=0;
            }

            else if(nums[i]==0)
            {
                ans[i]=pr;
            }
            else
            {
            ans[i]=pr2/nums[i];
            }
        }
        return ans;
    }
}
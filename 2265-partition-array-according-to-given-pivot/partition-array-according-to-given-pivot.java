class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[] = new int[nums.length];
        int smallpp =0;
        int bigpp;
        int smallc=0;
        int eqc=-1;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]<pivot)
            {
                smallc++;

            }
            if(nums[i]==pivot)
            {
                eqc++;
            }
        }
        bigpp= smallc;
        for(int i =0;i<=eqc;i++)
        {
ans[bigpp]=pivot;
bigpp++;
        }
        int i =0;
        while(smallpp!=smallc || bigpp!=nums.length)
        {
if(nums[i]<pivot)
{
    ans[smallpp]=nums[i];
    smallpp++;
}
else if(nums[i]>pivot)
{
    ans[bigpp]= nums[i];
    bigpp++;
    
}
i++;
        }
return ans;
    }
}
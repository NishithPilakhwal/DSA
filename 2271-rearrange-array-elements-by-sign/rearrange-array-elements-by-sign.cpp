class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) 
    {
     int n = nums.size();
     vector<int> nop(n);
    int cp=0;
    int cn =1;
    for(int i =0 ;i<n;i++)
    {
    if(nums[i]>0)
{
    nop[cp]= nums[i];
cp+=2;
    }
    else
    {
nop[cn]= nums[i];
cn+=2;

    }
    }
    return nop;
    }

};

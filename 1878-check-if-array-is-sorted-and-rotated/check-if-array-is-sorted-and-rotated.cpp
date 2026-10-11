class Solution{
public:
    bool check(vector<int>& nums) {
        if(nums.size()==1)
        {
            return true;
        }
        
        int flg =0;
        for(int i =0;i<=nums.size()-2;i++)
        {
            if(nums[i]>nums[i+1])
            {
                flg +=1;
            }
           if( flg >0 && nums[nums.size()-1]>nums[0] )
        {
            return false;
        }
        if(flg>1)
        {
            return false;
        }
        }
       
        
        return true;
    
        
    }
};
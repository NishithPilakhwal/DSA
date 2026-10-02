class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int cou=0;
        for(int i =0 ;i<nums.size();i++)
        {
            if(nums[i]==0)
            {
               
                cou ++;
            }
        }
        remove(nums.begin(),nums.end(),0);
        for(int i =0;i<cou;i++)
        {
            nums.pop_back();
        }
        for(int i =0 ;i<cou;i++)
        {
            nums.emplace_back(0);
        }
        
    }
};
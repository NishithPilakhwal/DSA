class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0,size,mid;
        size = nums.size()-1;
        while(low<=size)
        {
            mid =( low+size)/2;
            if(nums[mid]==target)
            {
                return mid;
            }
            if(target>nums[mid])
            {
                low =mid+1;
            }
            else
        {
            size=mid-1;
        }
        }
        if(target >nums[nums.size()-1])
        {
            return nums.size();

        }
        if(target<nums[0])
        {
            return 0;
        }
        for(int i =0;i<nums.size()-1;i++)
        {
            if(target >nums[i]&&target<nums[i+1])
            {
                return i+1;
            }
        }
        return -1;
    }

};
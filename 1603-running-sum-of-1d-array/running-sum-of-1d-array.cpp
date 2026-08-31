#include <bits/stdc++.h>

class Solution {
public:
    vector<int> runningSum(vector<int>& nums) {
        auto ptr = nums.begin();
        auto pt =nums.end();
        auto sum = nums[0];
        int n = nums.size();
        for(int i =1;i<n;i++)
        {
            sum = sum + nums[0 +i];
            nums.emplace_back(sum);
        }
        nums.erase(nums.begin()+1,nums.begin()+n);
        return nums;
    }
};
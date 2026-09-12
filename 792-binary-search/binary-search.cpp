#include <bits/stdc++.h>
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int mid,low = 0;
int max = nums.size()-1;
while(low<=max)
{
    mid = (low + max)/2;
    if(nums[mid]== target )
    {
        return mid;
    }
if(target >nums[mid])
{
    low = mid+1;
}
else 
{
    max = mid -1;
}
}
return -1;
    }
};
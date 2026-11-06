class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> GUN= new HashMap<>();
        for(int i =0;i<nums.length;i++)
        {
            if(GUN.containsKey(nums[i]))
            {
                if((i -GUN.get(nums[i])) <=k )
                {
                    return true;
                }
                else
                {
                    GUN.put(nums[i],i);
                }
            }
            else
            {
                GUN.put(nums[i],i);
            }
        }
        return false;
    }
}
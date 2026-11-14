class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goop=0;
HashMap<Integer,Integer> p=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            if(!p.containsKey(nums[i]))
            {
                p.put(nums[i],1);
            }
            else 
            {
                 goop+=p.get(nums[i]);
                p.put(nums[i],p.get(nums[i])+1);
              
            }
        }
        return goop;

        
    }
}
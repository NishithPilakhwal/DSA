class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        List<Integer> ans=new ArrayList<>();
        for(int i =0;i<nums.length;i++)
        {
          mp.put(nums[i],1);
          min=Math.min(nums[i],min);
          max=Math.max(max,nums[i]);
        }
        for(int i=min+1;i<max;i++)
        {
            if(!mp.containsKey(i))
            {
                ans.add(i);
                
            }

        }
        return ans;

    }
}
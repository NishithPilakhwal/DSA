class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int ans[] = new int[2] ;
        int j=0;
          HashMap<Integer,Integer> mp = new HashMap<>();
          for(int i =0;i<nums.length;i++)
          {
            if(mp.containsKey(nums[i]))
            {
                ans[j]=nums[i];
                j++;
            }
            else
            {
                mp.put(nums[i],1);
            }
          } 
          return ans;
           }

}
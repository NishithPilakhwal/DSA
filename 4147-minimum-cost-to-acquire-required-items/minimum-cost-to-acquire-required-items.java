class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long sameno = Math.min(costBoth,cost1+cost2);
        long ans = sameno * Math.min(need1,need2);
        if(need1>need2)
        {
            ans += (long) (need1-need2)*Math.min(costBoth,cost1);

    }  
    else if(need2>need1)
    {
        ans+=(long) (need2-need1)*Math.min(costBoth,cost2);
            }
    return ans;
        }
}
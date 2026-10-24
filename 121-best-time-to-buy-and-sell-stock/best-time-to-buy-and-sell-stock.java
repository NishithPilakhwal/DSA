class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0;
        int min=prices[0];
        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]<min)
        {
                min =prices[i];
        }
            if(prices[i]-min >maxp)
            {
                maxp= prices[i]-min;
            }
    
        }
        return maxp;
    }
}
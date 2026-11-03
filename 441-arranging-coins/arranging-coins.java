class Solution {
    public int arrangeCoins(int n) {
        long low =1;
        long high =n;
        long mid;
        long s;
        long t=0;

        while(low<=high)
        {
            mid = low +(high-low)/2;
             s= mid *(mid+1)/2;
            if(s <= n && s> t*(t+1)/2)
            {
             t =mid;
             low = mid+1;
            }
            else 
            {
                high = mid-1;
            }
        }
        return (int)t;
    }
}
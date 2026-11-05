class Solution {
    public boolean validDigit(int n, int x) {
        int las =Integer.MIN_VALUE;
        int temp=n;
        while(temp!=0)
        {
            int rem = temp%10;
            las = rem;
            temp/=10;
        }
        if(x == las)
        {
            return false;
        }

        while(n!=0)
        {
            
            int rem = n%10;

            if (rem==x )
            {
                return true;
            }
            n/=10;
        }
        return false;
    }
}
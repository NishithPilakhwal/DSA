class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumod=0;
        int sumev=0;
        for(int i =1;i<=n*2;i++)
        {
            if(i%2==0)
            {
                sumev+=i;
            }
            else
            {
                sumod+=i;
            }
        }
        while(sumev!=sumod)
        {
if(sumev>sumod)
{
    sumev = sumev-sumod;
}
else if(sumod>sumev)
{
    sumod=sumod-sumev;
}

        }
        return sumod;
    }
}
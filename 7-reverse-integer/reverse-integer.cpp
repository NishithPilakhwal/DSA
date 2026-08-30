class Solution {
public:
    int reverse(int x) {
        long long temp = x;
        long long rev=0;
        long long rem;
        while(temp !=0)
{
rem = temp%10;
temp = temp/10;
rev= rev*10+rem;
}
if(rev>INT_MAX || rev<INT_MIN)
{
    return 0;
}
else
{
return rev;
}
    }
};
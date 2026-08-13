class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0){
            return false;
        }
        
        long long sum=0;
        int rem;
       int temp =x;
        while(temp!=0)
        {
            rem = temp%10;
            temp=temp/10;
            sum =sum *10 +rem;
        }
        if (sum == x)
{
    return true;
}
else{
    return false;
}

    }
};
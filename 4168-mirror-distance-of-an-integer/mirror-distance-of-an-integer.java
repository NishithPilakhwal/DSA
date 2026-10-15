class Solution {
    public int mirrorDistance(int n) {
        int revn =0;
        int temp =n;
        while(temp!=0)
        {
int rem = temp%10;
revn = revn *10 + rem;
temp = temp/10;
        }
      if((n - revn)>0 )
      {
        return n - revn;
      }
      else
      {
        return -1 * (n-revn);
      }
    }
}
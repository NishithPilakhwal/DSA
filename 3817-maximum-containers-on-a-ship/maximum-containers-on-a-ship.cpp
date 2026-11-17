class Solution {
public:
    int maxContainers(int n, int w, int maxWeight) {
        int ans=0;
        for(int i =1;i<=n*n;i++)
        {
            if(w*i>maxWeight)
            {
                return ans;
            }
            ans +=1 ;
        }
        return ans;
    }
};
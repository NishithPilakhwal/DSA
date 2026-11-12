class Solution {
    public int[] Combunedarr(int[] h1,int[] h2)
    {
        int i =0;
        int j =0;
        int iona=0;
        int ans[] = new int[h1.length+h2.length];
        while(i<h1.length && j<h2.length)
        {
            if(h1[i]<h2[j])
            {
                ans[iona]=h1[i];
                i++;
                iona++;
            }
            else if(h1[i]>h2[j])
            {
                ans[iona]= h2[j];
                iona++;
                j++;
            }
            else
            {
                ans[iona]=h1[i];
                iona++;
                ans[iona]=h2[j];
                iona++;
                i++;
                j++;
            }
        }
        if(i==h1.length)
        {
            while(j<h2.length)
            {
                ans[iona]= h2[j];
                j++;
                iona++;
            }
        }
        else if(j==h2.length)
        {
         while(i<h1.length)
            {
                ans[iona]= h1[i];
                i++;
                iona++;
            }
        }
        return ans;
    
    
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] result = Combunedarr(nums1,nums2);
        double res;
        if(result.length%2==0)
        {
         res = (double)(result[(result.length/2)] + result[result.length/2 -1] )/2;
        }
        else
        {
            res = (double)result[result.length/2];
        }
        return res;
        
    }
}
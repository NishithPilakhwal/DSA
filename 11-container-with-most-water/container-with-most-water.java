class Solution {
    public int maxArea(int[] height) {
        int maxar=0;
        int low =0;
        int high=height.length-1;
        while(low!=high)
        {
            maxar =  Math.max(maxar,(high-low) * Math.min(height[low],height[high]));
            if(height[low]<=height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }
        return maxar;
    }
}
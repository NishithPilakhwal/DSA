class Solution {
    public int largestAltitude(int[] gain) {
        int maxal=0;
        int al=0;
        for(int i =0;i<gain.length;i++)
        {
            al +=gain[i];
            maxal=Math.max(al,maxal);
        }
        return maxal;
    }
}
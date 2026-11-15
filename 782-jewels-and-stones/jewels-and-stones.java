class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int c=0;
     for(int i =0;i<stones.length();i++)
     {
        char p = stones.charAt(i);
        if(jewels.indexOf(p)!=-1)
        {
            c++;
        }
     }
     return c;
    }
}
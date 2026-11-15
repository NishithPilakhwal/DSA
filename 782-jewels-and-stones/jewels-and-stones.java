class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> jew = new HashMap<>();
        int c=0;
        for(int i =0;i<jewels.length();i++)
        {
            jew.put(jewels.charAt(i), 1);
        }
        for(int i =0;i<stones.length();i++)
        {
if(jew.containsKey(stones.charAt(i)))
{
    c++;
}
        }
        return c;
    }
}
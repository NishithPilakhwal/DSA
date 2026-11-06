class Solution {
    public int maxDistinct(String s) {
        HashMap<Character,Integer> mo = new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            if(mo.containsKey(s.charAt(i)))
            {
                continue;
            }
            else
            {
                mo.put(s.charAt(i),1);
            }
        }
        return mo.size();
    }
}
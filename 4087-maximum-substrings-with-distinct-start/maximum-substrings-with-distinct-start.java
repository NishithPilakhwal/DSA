class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> mo = new HashSet<>();
        for(int i =0;i<s.length();i++)
        {
            mo.add(s.charAt(i));
        }
        return mo.size();
    }
}
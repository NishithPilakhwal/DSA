class Solution {
    public int lengthOfLastWord(String s) {
        int lem=0;
        int sp =0;
        for(int i = s.length()-1;i>=0;i--)
        {
            if(s.charAt(i) == ' ' && sp ==1)
            {
                return lem;
            }
            else if(s.charAt(i) != ' ')
            {
                sp =1;
                lem++;
            }
            
        }
        return lem;
    }
}
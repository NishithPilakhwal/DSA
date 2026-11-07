class Solution {
    public boolean checkString(String s) {
        if(s.indexOf('b')==-1)
        {
            return true;
        }
        for(int i =s.indexOf('b') +1;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                return false;
            }
        }
        return true;
    }
}
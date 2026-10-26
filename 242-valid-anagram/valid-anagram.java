class Solution {
    public boolean isAnagram(String s, String t) {
        int st1[]= new int[26];
            int st2[]= new int[26];
            for(int i =0;i<s.length();i++)
            {
                st1[(int)s.charAt(i)- 97]++;
            }
            for(int i =0;i<t.length();i++)
            {
                st2[(int)(t.charAt(i)) -97]++;
            }
            for(int i =0;i<26;i++)
            {
                if(st1[i]!=st2[i])
                {
                    return false;
                }
            }
            return true;
    }
}
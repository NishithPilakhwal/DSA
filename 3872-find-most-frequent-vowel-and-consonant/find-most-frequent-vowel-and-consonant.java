class Solution {
    public int maxFreqSum(String s) {
        int hold[] = new int[26];
        for(int i =0;i<s.length();i++)
        {
            hold[s.charAt(i) -'a']++;
        }
        int cmax=0;
        int vmax=0;
        for(int i =0;i<s.length();i++)
        {
            char p=s.charAt(i);
            if(p=='a'||p=='e' ||p=='i'||p=='o'||p=='u')
            {
                vmax=Math.max(vmax,hold[p-'a']);
            }
            else
            {
             cmax=Math.max(cmax,hold[p-'a']);
        }
        }
        return vmax+cmax;

    }
}
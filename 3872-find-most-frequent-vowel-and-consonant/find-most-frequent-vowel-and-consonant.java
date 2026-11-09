class Solution {
    public int maxFreqSum(String s) {
        int hold[] = new int[26];
        int cmax=0;
        int vmax=0;
        int n = s.length();
       for(int i =0;i<n;i++)
       {
        char f = s.charAt(i);
        hold[f-'a']++;
        if(f =='a'||f=='e'||f=='i'||f=='o'||f=='u')
        {
           if(hold[f-'a']>vmax)
           {
            vmax=hold[f-'a'];
           }
        }
        else
        {
            if(cmax<hold[f-'a'])
            {
                cmax = hold[f-'a'];
            }
        }
       }
       return cmax+vmax;

    }
}
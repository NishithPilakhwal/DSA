class Solution {
    public int maxFreqSum(String s) {
        int hold[] = new int[26];
        int cmax=0;
        int vmax=0;
       for(int i =0;i<s.length();i++)
       {
        char f = s.charAt(i);
        hold[f-'a']++;
        if(f =='a'||f=='e'||f=='i'||f=='o'||f=='u')
        {
            vmax=Math.max(vmax,hold[f-'a']);
        }
        else
        {
            cmax=Math.max(cmax,hold[f-'a']);
        }
       }
       return cmax+vmax;

    }
}
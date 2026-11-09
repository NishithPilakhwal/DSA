class Solution {
    public int maxFreqSum(String s) {
        int[] hold = new int[26];
        int vmax = 0, cmax = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char p = s.charAt(i);
            int idx = p - 'a';

            hold[idx]++;

            if ("aeiou".indexOf(p) != -1) {
                vmax = Math.max(vmax, hold[idx]);
            } else {
                cmax = Math.max(cmax, hold[idx]);
            }
        }

        return vmax + cmax;
    }
}

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> consonant = new HashMap<>();
        HashMap<Character, Integer> vowel = new HashMap<>();
        int f1max = 0;
        int fmax = 0;
        for (int i = 0; i < s.length(); i++) {
            char w = s.charAt(i);
            if (w == 'a' || w == 'e' || w == 'i' || w == 'o' || w == 'u') {
                if (vowel.containsKey(w)) {
                    vowel.put(w, vowel.get(w) + 1);
                } else {
                    vowel.put(w, 1);
                }

            } else {
                if (consonant.containsKey(w)) {
                    consonant.put(w, consonant.get(w) + 1);
                } else {
                    consonant.put(w, 1);
                }

            }
        }
        for (char it : vowel.keySet()) {
            if (vowel.get(it) > f1max) {
                f1max = vowel.get(it);
            }
        }
        for (char it : consonant.keySet()) {
            if (consonant.get(it) > fmax) {
                fmax = consonant.get(it);
            }
        }
        return f1max + fmax;
    }
}
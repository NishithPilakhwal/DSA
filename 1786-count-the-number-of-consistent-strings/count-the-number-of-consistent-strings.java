class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i =0;i<words.length;i++)
        {
        boolean valid = true;

for (int j = 0; j < words[i].length(); j++) {
    if (allowed.indexOf(words[i].charAt(j)) == -1) {
        valid = false;
        break;
    }
}

if (valid) count++;
        }
        return count;
    }
}
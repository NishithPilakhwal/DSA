class Solution {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        StringBuilder sb = new StringBuilder(word);
        char tempch;
        for(int i =0;i<(ind+1)/2;i++)
    {
tempch = sb.charAt(ind-i);
sb.setCharAt(ind-i,sb.charAt(i));
sb.setCharAt(i ,tempch);
    }
        
        return sb.toString();

    }
}
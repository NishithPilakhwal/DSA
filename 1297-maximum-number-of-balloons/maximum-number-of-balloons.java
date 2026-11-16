class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> mp= new HashMap<>();
        mp.put('b', 0);
         mp.put('a', 0);
        mp.put('l', 0);
         mp.put('o', 0);
         mp.put('n', 0);
        for(int i =0;i<text.length();i++)
        {
            char p =text.charAt(i);
            if(p=='b'||p=='a'||p=='l'||p=='o'||p=='n')
            {
           
                    mp.put(p,mp.get(p)+1);
                }
               
        }
       return Math.min(Math.min(Math.min(mp.get('b'),mp.get('a')),Math.min(mp.get('l')/2,mp.get('o')/2)) , mp.get('n'));
    }
}
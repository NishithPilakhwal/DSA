class Solution {
    public int digitFrequencyScore(int n) {
        HashMap<Integer,Integer> sup = new HashMap<>();
        while(n!=0)
        {
            int rem = n%10;
            if(sup.containsKey(rem))
            {
                sup.put(rem,sup.get(rem) +1);
            }
            else
            {
                sup.put(rem,1);
            }
            n/=10;

            
        }
        int s=0;
        for(int it : sup.keySet())
        {
         s += it *sup.get(it);
        }
        return s;
    }
}
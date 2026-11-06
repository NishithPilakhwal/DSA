class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashMap<Integer,Integer> hi = new HashMap<>();
        for(int i =0;i<friends.length;i++)
        {
            hi.put(friends[i],1);
        }
        int j =0;
        for(int i =0;i<order.length;i++)
        {
        if(j==friends.length)
        {
            break;
        }
        if(hi.containsKey(order[i]))
        {
            friends[j]=order[i];
            j++;
        }
        }
        return friends;
    }
}
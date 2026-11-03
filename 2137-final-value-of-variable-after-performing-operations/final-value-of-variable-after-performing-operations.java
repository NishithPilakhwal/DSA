class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int op=0;
        for(int i =0;i<operations.length;i++)
        {
            if(operations[i].charAt(1)=='+')
            {
                op++;
            }
            else
            {
                op--;
            }
        }
        return op;
    }
}
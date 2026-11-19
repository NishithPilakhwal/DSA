class Solution {
    public int xorOperation(int n, int start) {
        int arr[] = new int[n];
        int sor=0;
        for(int i =0;i<n;i++)
        {
            int temp= start +2*i;
            sor = sor^temp;
        }
        return sor;
    }
}
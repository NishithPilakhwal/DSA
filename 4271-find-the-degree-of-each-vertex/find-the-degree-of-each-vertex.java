class Solution {
    public int[] findDegrees(int[][] matrix) {
        int ans[] = new int[matrix.length];
        for(int i =0;i<matrix.length;i++)
        {
            int c1=0;
            for(int j=0;j<matrix.length;j++)
            {
                 if(matrix[i][j]==1)
                 {
                    c1++;
                 }
            }
            ans[i]=c1;
        } 
        return ans;
    }
}
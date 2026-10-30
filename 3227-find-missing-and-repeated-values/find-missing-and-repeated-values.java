class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> df = new HashMap<>();
        int n = grid.length;
        int m[] = new int[2];
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             if (df.containsKey(grid[i][j])) {
              df.put(grid[i][j], df.get(grid[i][j]) + 1);
            } 
              else {
    df.put(grid[i][j], 1);
             }
            }
        }
      for (Map.Entry<Integer, Integer> entry : df.entrySet()) {
    if (entry.getValue() == 2) {
        m[0] = entry.getKey();  
        break;
    }
}
for (int i = 1; i <= n * n; i++) {
    if (!df.containsKey(i)) {
        m[1] = i;
        break;
    }
}
return m;
    
  }

    }

    

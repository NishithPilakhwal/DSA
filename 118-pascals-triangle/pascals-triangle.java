class Solution {
    public List<List<Integer>> generate(int numRows) {

List<List<Integer>> ans=new ArrayList<>();
List<Integer> ans0 =new ArrayList<>();


        long val;
        for(int j =0;j<numRows;j++)
        {
        
           val = 1;
          ans0.clear();
        
        for (int i = 0; i <= j; i++) {
            ans0.add((int) val);
            val = val * (j - i) / (i + 1);
        }
        ans.add(new ArrayList<>(ans0));

        }
        return ans;

    }
}
class Solution {
public:
    int maxContainers(int n, int w, int maxWeight) {
  int m =n*n;
  if(m*w<=maxWeight)
  {
    return m;
  }
  return maxWeight/w;
    }
};
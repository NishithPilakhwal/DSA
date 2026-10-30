
class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& grid) {
        unordered_map<int, int> df;
        int n = grid.size();
        vector<int> m(2);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (df.count(grid[i][j])) {
                    df[grid[i][j]] = df[grid[i][j]] + 1;
                }
                else {
                    df[grid[i][j]] = 1;
                }
            }
        }

        for (auto entry : df) {
            if (entry.second == 2) {
                m[0] = entry.first;
                break;
            }
        }

        for (int i = 1; i <= n * n; i++) {
            if (df.count(i) == 0) {
                m[1] = i;
                break;
            }
        }

        return m;
    }
};

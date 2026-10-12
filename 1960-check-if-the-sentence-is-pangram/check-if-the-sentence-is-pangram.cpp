class Solution {
public:
    bool checkIfPangram(string sentence) {
        
        vector<int> has(26,0);
        for(int i =0 ;i<sentence.size();i++)
        {
            has[sentence[i]-'a']++;
        }
for(auto it:has)
{
    if(it==0)
    {
        return false;
    }
}
return true;
    }
};
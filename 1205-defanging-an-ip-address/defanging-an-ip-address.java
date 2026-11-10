class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int n = address.length();
        for(int i =0;i<n;i++)
        {
            char d = address.charAt(i);
            if(d=='.')
            {
                sb.append("[.]");
            }
            else
            {
                sb.append(d);
            }
                    

                    
        }
        return sb.toString();
    }
}
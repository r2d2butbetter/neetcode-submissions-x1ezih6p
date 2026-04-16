class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String f = strs[0];
        StringBuilder res = new StringBuilder();
        for (int i=0; i<f.length(); i++)
        {
            for(int j=1; j<strs.length; j++)
            {
                String temp = strs[j];
                if(i>=temp.length() || !(temp.charAt(i)==f.charAt(i)))
                {
                    return res.toString();
                }
            }
            res.append(f.charAt(i));
        }

        return res.toString();
    }
}
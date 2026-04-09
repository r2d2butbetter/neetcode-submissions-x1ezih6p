class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder encoded = new StringBuilder();
        for(String str: strs)
        {
            int len = str.length();
            encoded.append(len);
            encoded.append('#');
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {

        List<String> decoded = new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            int j=i;
            while(str.charAt(j)!='#') j++;

            String lens = str.substring(i,j);
            int len =Integer.parseInt(lens);
            j++;
            
            decoded.add(str.substring(j, j+len));
            i=j+len;
        }

        return decoded;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {


        int slen=s.length(), tlen=t.length();

        if (slen!=tlen) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        for(int i=0; i<slen; i++)
        {
            map.put(sarr[i], map.getOrDefault(sarr[i], 0)+1);
            map.put(tarr[i], map.getOrDefault(tarr[i], 0)-1);

            map.entrySet().removeIf(entry -> entry.getValue()==0);
        }

        return map.isEmpty();
    }
}

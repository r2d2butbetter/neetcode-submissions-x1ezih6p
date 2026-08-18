class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length()!=t.length()) return false;

        HashMap<Character, Integer> ss = new HashMap<>();
        for(char c:  s.toCharArray())
        {
            if(ss.containsKey(c))
            {
                ss.put(c, ss.get(c)+1);
            }
            else ss.put(c, 1);
        }

        HashMap<Character, Integer> ts = new HashMap<>();
        for(char c:  t.toCharArray())
        {
            if(ts.containsKey(c))
            {
                ts.put(c, ts.get(c)+1);
            }
            else ts.put(c, 1);
        }

        return ss.equals(ts);
    }
}

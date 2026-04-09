class Solution {
    public boolean isAnagram(String s, String t) {
        Hashtable<Character, Integer> ts = new Hashtable<>();
        // key val, -> char, freq

        for (char c : s.toCharArray()) {
            if (ts.containsKey(c)) {
                int temp = ts.get(c) + 1;
                ts.put(c, temp);
            } else {
                ts.put(c, 1);
            }
        }

        Hashtable<Character, Integer> tt = new Hashtable<>();
        for (char c : t.toCharArray()) {
            if (tt.containsKey(c)) {
                int temp = tt.get(c) + 1;
                tt.put(c, temp);
            } else {
                tt.put(c, 1);
            }
        }

        //now the comparision
        return ts.equals(tt);
    }
}
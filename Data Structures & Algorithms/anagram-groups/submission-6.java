class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> res = new HashMap<>();
        for (String str : strs)
        {
            char[] freq = new char[26];
            for(int i = 0; i < str.length(); i++)
            {
                freq[str.charAt(i)-'a']++;
            }

            String key = new String(freq);
            res.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(res.values());
    }
}

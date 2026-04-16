class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        HashMap<String, List<String>> map = new HashMap<>();

        for(String str: strs)
        {
            int[] chars = new int[26];

            for(char c: str.toCharArray())
            {
                chars[c-'a']++;
            }
            String charkey = Arrays.toString(chars);
            map.putIfAbsent(charkey, new ArrayList<>());

            map.get(charkey).add(str);
        }

        return new ArrayList<>(map.values());

    }
}

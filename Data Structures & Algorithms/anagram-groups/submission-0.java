class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> res = new HashMap<>();

        for (String s : strs) {
            int count[] = new int[26]; // frew array for each string

            for (char c : s.toCharArray()) {
                count[((int) c) - (int) 'a']++;
            }
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());

            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        

        int[] top = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums)
        {
            // (map.getOrDefault(num, 0)+1);
            map.put(num, map.getOrDefault(num,0)+1);
        }

        
        for(int i=0; i<k; i++)
        {
            int maxfreq=-1;
            int maxkey = -1;

            for(int key: map.keySet())
            {
                if (map.get(key)>maxfreq)
                {
                    maxkey = key;
                    maxfreq = map.get(key);
                }
            }

            top[i] = maxkey;
            map.remove(maxkey);
        }
        return top;
    }
}

class Solution {
    public int longestConsecutive(int[] nums) {

      Set<Integer> numset = new HashSet<>();
     for(int num: nums) numset.add(num);

     int maxlen=0;

     for(Integer num: numset)
     {

        if(!numset.contains(num-1))
        {
            int length=1;
            while(numset.contains(num+length)) length++;


            maxlen = Math.max(maxlen, length);
        }
     }
         return maxlen;
    }
}

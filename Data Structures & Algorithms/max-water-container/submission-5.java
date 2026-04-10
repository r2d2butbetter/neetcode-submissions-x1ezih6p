class Solution {
    public int maxArea(int[] heights) {

        int maxvol = 0;

        int l=0, r=heights.length-1;

        while(l<r)
        {
            int height = Math.min(heights[l], heights[r]);
            int vol = height*(r-l);

            maxvol = Math.max(maxvol, vol);

            // l++;r--;
            if(heights[l]<heights[r]) l++;
            else r--;
        }   

        return maxvol;
    }
}

class Solution {
    public int trap(int[] height) {
        int frontmax = height[0];
        int backmax = height[height.length-1];

        int front=0, back= height.length-1;
        int res =0;

        while(front<back)
        {
            if(frontmax<backmax)
            {
                front++;
                frontmax = Math.max(frontmax, height[front]);
                res+= frontmax - height[front];
            }

            else
            {
                back--;
                backmax = Math.max(backmax, height[back]);

                res+= backmax - height[back];
            }
        }

        return res;
    }
}

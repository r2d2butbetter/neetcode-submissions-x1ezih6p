class Solution {
    public int maxProfit(int[] prices) {

        int leastsofar=100000;   
        int pist=0;

        for(int price: prices)
        {
            if(leastsofar>price)
            {
                leastsofar = price;
            }

            int prn = price - leastsofar;

            if(prn>pist)
            {
                pist = prn;
            }
        }

        return pist;
    }
}

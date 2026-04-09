class Solution {
    public int maxProfit(int[] prices) {
        int leastSoFar=10000;
        int maxProfit=0;

        for(int i=0; i<prices.length; i++)
        {
            if (prices[i]<leastSoFar)
            {
                leastSoFar = prices[i];
            }
            int profit=prices[i]-leastSoFar;
            if (profit>maxProfit)
            {
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}
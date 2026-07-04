class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int x=0;
        for (int i = 0; i <prices.length; i++) {
            if(prices[i]<prices[x]){
                x=i;
            }
            

            if(prices[i]>prices[x]){
                int bprofit=prices[i]-prices[x];

                if(bprofit>profit){
                    profit=bprofit;
                }

            }

        }
        return profit;
    }
}

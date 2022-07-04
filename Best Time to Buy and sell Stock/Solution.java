class Solution {
    public int maxProfit(int[] prices) {
      int max = 0;  
      int min = (int)1e9;
      for(int i=0; i<prices.length; i++){
          min = Math.min(prices[i],min);
          max = Math.max(prices[i]-min,max);
      }
      return max;
    }
}
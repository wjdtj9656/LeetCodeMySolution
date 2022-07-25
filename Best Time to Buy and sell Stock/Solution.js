/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
  let max = 0;
  let min = 987654321;
    for(let i=0; i<prices.length; i++){
      min = Math.min(min, prices[i]);
      max = Math.max(prices[i] - min,max);
      }
  return max;
};
public class Profit {

    public static int maxProfit(int [] prices){
        int minPrice = Integer.MAX_VALUE;  // Initialize minimum price to a large value
        int maxProfit = 0;  // Initialize maximum profit to zero
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];  // Update minimum price if a lower price is found
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);  // Update maxProfit if a better sell day is found
            }
        }
        
        return maxProfit;
        
    }
    public static void main(String[] args) {
        int [] prices={7,1,5,3,6,4};
        int profit=maxProfit(prices);
        System.out.println(profit);
    }
}

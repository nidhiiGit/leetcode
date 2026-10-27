public class buyAndSellStocks {
    public static int MaxProfit(int prices[] , int n){
        int maxProfit=0;
        int bestBuy = prices[0];
        for(int i=1; i<n; i++){
            if(bestBuy>prices[i]){
                bestBuy=prices[i];
            }else if(prices[i]-bestBuy > maxProfit){
                maxProfit = prices[i]-bestBuy;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,6,4};

        int n= prices.length;
        System.out.println(MaxProfit(prices,n));
    }
}

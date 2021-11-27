package com.codingPractice.Arrays;

public class StockBuyNSell1 {
    //Driver Code
    public static void main(String[] args){

        int[] stockList = new int[]{5,1,3,7,6,2};
        System.out.println("Profits availed after selling the shares: " + getMaxProfits(stockList));
    }

    //Function to get the details of Max profits from the given Stock/Share Price Array
    public static int getMaxProfits(int[] stockList) {
        int minStockPrice = stockList[0];
        int current_profits = 0;
        int MaxProfitsAvailed = 0;

        for(int i =1; i < stockList.length; i++){
            minStockPrice = Math.min(stockList[i], minStockPrice);
            current_profits = Math.max(current_profits, stockList[i] - minStockPrice);
            MaxProfitsAvailed = Math.max(MaxProfitsAvailed, current_profits);
        }

        return MaxProfitsAvailed;
    }
}

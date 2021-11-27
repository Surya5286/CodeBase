package com.codingPractice.Arrays;

public class StockBuyNSell2_ProfitsSum {
    //Driver Code
    public static void main(String[] args){
         int[] StockPriceDetails = new int[] {3,1,8,5,2,7,4,6};
         System.out.println("Profits availed from the given Stocs: " + getProfitSumAvailed(StockPriceDetails));
    }

    public static int getProfitSumAvailed(int[] stockPriceDetails) {
        int minStockPrice = stockPriceDetails[0];
        int ProfitSum =  0;

        for(int i = 1; i < stockPriceDetails.length; i++)
        {
            if(stockPriceDetails[i] > stockPriceDetails[i-1]){
                ProfitSum += stockPriceDetails[i] - stockPriceDetails[i-1];
                System.out.println(ProfitSum);
            }
        }
        return ProfitSum;
    }
}

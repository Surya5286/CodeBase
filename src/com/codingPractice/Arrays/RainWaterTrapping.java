package com.codingPractice.Arrays;

public class RainWaterTrapping {

    public static int findWaterStoredBetweenBlocks(int[] array) {
        int n = array.length;
        int waterStored = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        left[0] = array[0];
        for(int i = 1; i < n; i++ ){
            left[i] = Math.max(left[i-1], array[i]);
        }

        right[n-1] = array[n-1];
        for(int i = n-2; i>=0; i--){
            right[i] = Math.max(right[i+1], array[i]);
        }

        for(int i = 0; i<n; i++){
            waterStored += Math.min(left[i],right[i]) - array[i];
        }

        return waterStored;
    }

    // Driver Code
    public static void main(String[] args){

        int[] array = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println("Total No.Of units water stored between the blocks: " + findWaterStoredBetweenBlocks(array));
    }
}

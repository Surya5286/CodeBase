package com.codingPractice.SortingTechniques;

public class InsertionSort {

    public static void main(String[] args){
        int[] arrayToSort = new int[] {1,3,9,12,13,10,7,8,5};
        arrayToSort = getSortedArray(arrayToSort);

        for(int i=0; i < arrayToSort.length; i++){
            System.out.print(" "+arrayToSort[i]);
        }
    }

    public static int[] getSortedArray(int[] arrayToSort) {

        long t1 = System.currentTimeMillis();
        for(int i = 1; i < arrayToSort.length; i++){
            int temp = arrayToSort[i];
            int j = i-1;

            while (j>=0 && arrayToSort[j]>temp){
                arrayToSort[j+1] = arrayToSort[j];
                j--;
            }
            arrayToSort[j+1] = temp;
        }

        long t2 = System.currentTimeMillis();

        System.out.println("Time taken by the Insertion Sort: " + (float) (t2-t1) / 1000);

        return arrayToSort;
    }

}

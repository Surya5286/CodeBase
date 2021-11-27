package com.codingPractice.SortingTechniques;

public class BubbleSort {
    public static void main(String[] args){
        int[] arrayToSort = new int[] {1,3,9,7,8,5};
        arrayToSort = getSortedArray(arrayToSort);

        for(int i=0; i < arrayToSort.length; i++){
            System.out.print(" "+arrayToSort[i]);
        }
    }

    public static int[] getSortedArray(int[] arrayToSort){

        for(int i = arrayToSort.length-1; i > 0; i--){
            boolean swappedArray = false;
            for(int j = 0; j < i; j++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    swappedArray = true;
                    swap(arrayToSort, j, j+1);
                }
            }
            if(!swappedArray)
                break;
        }

        /*
        for(int i = 0; i < arrayToSort.length - 1; i++){
            for(int j=0; j < arrayToSort.length-i-1; j++){
                if(arrayToSort[j] > arrayToSort[j+1]){
                    swap(arrayToSort, j, j+1);
                }
            }
        }
        */

        return arrayToSort;
    }

    public static void swap(int[] array, int i, int j){
        if(i == j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
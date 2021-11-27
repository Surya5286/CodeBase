package com.codingPractice.Arrays;

public class MajorityNumberInArray {

    //Driver Code
    public static void main(String[] args){
        int[] array = new int[] {2,3,5,2,2};
        printMajorityItemByMooresVotingAlgorithm(array);
    }

    // Function to return Majority Item from a given array [must appear more than array.length/2]
    public static int getMajorityItemByMooresVotingAlgorithm(int[] array) {
        int majorityItemIndex = 0;
        int count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[majorityItemIndex] == array[i])        //{2,3,5,2,2,5}
                count++;
            else
                count--;
            if(count == 0){
                majorityItemIndex = i;
                count++;
            }
        }

        return array[majorityItemIndex];
    }

    // Function to confirm the Majority Item return from above function appears more than array.length/2
    public static void printMajorityItemByMooresVotingAlgorithm(int[] array){
        int count = 0;
        int size = array.length;
        int item = getMajorityItemByMooresVotingAlgorithm(array);

        for(int i = 0; i < array.length; i++){
            if( array[i] == item)
                count++;
        }

        if(count > size /2)
            System.out.println("The Majority Item in the array is: " + item);
        else
            System.out.println("No Majority Item in the array :( ");
    }
}

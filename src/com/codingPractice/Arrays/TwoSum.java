package com.codingPractice.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        int target = 16;
        int[] array = new int[] {3,2,1,5,6,7,9};

        int[] result = getTwoSum(array, target);

        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] getTwoSum(int[] array, int target) {

        Map<Integer, Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i< array.length; i++){
            int delta = target - array[i];
            if(visitedNumbers.containsKey(delta)){
                return new int[] {i,visitedNumbers.get(delta)};
            }
            visitedNumbers.put(array[i],i);
        }
        return new int[] {-1, -1};
    }
}

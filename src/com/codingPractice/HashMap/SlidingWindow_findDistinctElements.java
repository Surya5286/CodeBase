package com.codingPractice.HashMap;

import java.util.HashMap;
import java.util.Map;

public class SlidingWindow_findDistinctElements {
    public static void main(String[] args) {
     int[] a = new int[] {1,2,2,1,3,4,5,2,1,3};
     int k = 4;
     
     // Optimized Solution using HashMap
     getDifferentElementsInGivenWindowUsingHashMap(a,k);

     // BrutwForce approach
     getDifferentElementsInGivenWindow_BruteForce(a,k);
    }
    
    
    // TODO: Implement using the BruteForce approach
    private static void getDifferentElementsInGivenWindow_BruteForce(int[] a, int k) {
    }

    
    // Implementation using the HashMap Concept
    private static void getDifferentElementsInGivenWindowUsingHashMap(int[] a, int k) {
        Map<Integer,Integer> element = new HashMap<>();
        if(k>a.length)
            return;
        for (int i = 0; i < k; i++) {
            element.put(a[i],element.getOrDefault(a[i],0) + 1);
        }
        System.out.println("Different Elements: " + element.size() + " " + '\t' +  "Window Position: " + (k));

        for(int i=k; i<a.length;i++){
            if (element.get(a[i-k]) == 1)
                element.remove(a[i-k]);
            else
                element.put(a[i-k], element.get(a[i-k]) - 1);
            element.put(a[i], element.getOrDefault(a[i], 0) + 1);
            System.out.println("Different Elements: " + element.size() + " " + '\t' +  "Window Position: " + (i+1));
        }
    }
}

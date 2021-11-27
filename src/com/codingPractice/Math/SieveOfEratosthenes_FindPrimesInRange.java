/*
    SieveOfEratosthenes is an Algorithm to find the Primes in a given range of N values

    Steps to implement:
    1. Implement an array with N + 1 length including number "0" and initialize or Fill the array with value true.
    2. Find all the multiples of a given number got from loop1 and make them false in the given array using loop2.
 */

package com.codingPractice.Math;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes_FindPrimesInRange {

    //Driver Code
    public static void main(String[] args){
        System.out.println("Enter range of Primes to be display: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] isPrimes = getPrimesInGivenRange(n);

        //print the boolean array of primes
        for(int i = 0; i < isPrimes.length; i++){
            System.out.println(i+" "+isPrimes[i]);
        }
    }

    // Function to find and return all of the primes from 0 to given number. Array length would be [0.....N+1]
    public static boolean[] getPrimesInGivenRange(int n) {

        boolean[] primesArray = new boolean[n + 1];

        Arrays.fill(primesArray,true);

        //initialize 0 and 1 -- false and remaining all the values to be true till N elements.
        primesArray[0] = false;
        primesArray[1] = false;

        //logic to find the primes. Outer loop Iterate from 2 to sqrt(N) for a given N value.
        //Inner loop used to find the primes and make array elements value to be true.

        for(int i = 2; i * i <= n; i++){
            for(int j = 2*i; j<=n; j+=i){
                primesArray[j] = false;
            }
        }
        return primesArray;
    }
}
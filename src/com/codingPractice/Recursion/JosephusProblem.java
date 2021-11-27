package com.codingPractice.Recursion;

public class JosephusProblem {
    public static void main(String[] args){
        System.out.println("The Last position of the person living in the crew: "+getSafePersonLive(5,3));
    }

    private static int getSafePersonLive(int n, int k) {
        if(n == 1)
            return 0;
        else
            return (getSafePersonLive(n-1, k) + k) % n;
    }
}



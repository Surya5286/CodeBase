package com.codingPractice.Math;

public class EuclidGeometry_FindGCD {

    public static void main(String[] args){
        System.out.println(getGcdOf2Numbers(24, 60));
    }

    public static int getGcdOf2Numbers(int a,int b){
        if(b == 0) return a;
        else{
            return getGcdOf2Numbers(b, a%b);
        }
    }
}

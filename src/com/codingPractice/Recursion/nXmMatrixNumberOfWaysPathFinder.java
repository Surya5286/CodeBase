package com.codingPractice.Recursion;

public class nXmMatrixNumberOfWaysPathFinder {

    public static void main(String[] args){
        System.out.println(findNoOfPaths(4,3));
    }

    public static int findNoOfPaths(int rows, int columns) {

        if( rows == 1 || columns == 1)
            return 1;
        else
            return findNoOfPaths(rows-1, columns) + findNoOfPaths(rows, columns-1);
    }
}

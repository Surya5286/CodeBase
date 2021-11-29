package com.codingPractice.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        int n = 5;
        getPattern1(n);
        System.out.println();
        getPattern2(n);
        System.out.println();
        getPattern3(n);
        System.out.println();
        getPattern4(n);
        System.out.println();
        getPattern5(n);
        System.out.println();
        getPattern6(n);
    }

    /* Print an number pyramid
                1
              2 1 2
            3 2 1 2 3
          4 3 2 1 2 3 4
        5 4 3 2 1 2 3 4 5

    */

    public static void getPattern6(int n){
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");
            }

            System.out.println();
        }
    }

    /*  Print a diamond shaped * pattern

         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

     */

    public static void getPattern5(int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColInRows = i > n ? 2 * n - i: i;
            int spaces = n - totalColInRows;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColInRows; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    /*  Print an incremental & decremental triangle

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * *
     * * *
     * *
     *

     */

    public static void getPattern4(int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalColumnsInRow = i>n? 2*n-i:i;
            for (int j = 0; j < totalColumnsInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Print an inverted Right angled Triangle

     * * * * *
     * * * *
     * * *
     * *
     *


     */

    public static void getPattern3(int n) {
        for (int i = 1; i <= n ; i++) {
            for( int j = 1; j <= n -i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /* Print a right angle triangle

     *
     * *
     * * *
     * * * *
     * * * * *

     */
    public static void getPattern2(int n) {
        for (int i = 1; i <= n ; i++) {
            for( int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    /*  Print a Square pattern
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     * * * * *
     */

    public static void getPattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}

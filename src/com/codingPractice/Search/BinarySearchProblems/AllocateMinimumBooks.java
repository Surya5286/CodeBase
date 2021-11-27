package com.codingPractice.Search.BinarySearchProblems;

public class AllocateMinimumBooks {
    public static void main(String[] args) {
        int[] a = {12, 34, 67, 90};
        int minimumStudents = 2;
        System.out.println("Minimum value of Max Number Of Pages to be read by students are: " +
                getPages(a,a.length,minimumStudents));
    }

    public static int getPages(int[] a, int n, int minimumStudents) {
        long sum = 0;

        if( n < minimumStudents) //if no.of books < Students stop the process and return -1... :)
            return -1;

        for (int i = 0; i < n; i++)
            sum += a[i];

        int start = 0, end = (int)sum, result = -1;

        while(start<=end){

            int mid = start + (end - start)/2;

            if(isPossible(a,n,minimumStudents,mid)){
                result = mid;
                end = mid - 1;
            }
            else
                start = mid+1;
        }
        return result;
    }

    public static boolean isPossible(int[] a, int n, int minimumStudents, int curMinResult) {
        int curSum = 0;
        int StudentsRequired = 1;

        for (int i = 0; i < n; i++){

            if(a[i]>curMinResult)
                return false;

            if(curSum + a[i] > curMinResult){
                StudentsRequired++;
                curSum = a[i];

                if(StudentsRequired > minimumStudents)
                    return false;
            }
            else
                curSum += a[i];
        }
        return true;
    }
}

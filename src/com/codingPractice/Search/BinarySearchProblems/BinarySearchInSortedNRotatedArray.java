/*      Modified Version of the Binary Search Algorithm.
    Steps:
    1. Given an Sorted array which was rotated N times [in general] and a key to find.
    2. Select a middle element and check
             (a)   if      a[mid] > a[start/low] --> left part is sorted
             (b)  else     a[mid] < a[end/high] --> right part of array is sorted.
    3. Compare the key element with a[mid] then return mid
    4. If Key value doesn't equals to a[mid],
            then proceed to verify in left part of sorted array (a) from step 2,
                Check for the range of key value and update the low and high values accordingly.
            or proceed to verify in right part of sorted array (b) from step 2,
                Check for the range of key value and update the low and high values accordingly.
    5. Traverse through all the existing elemnts as above if not return -1.
 */
package com.codingPractice.Search.BinarySearchProblems;

import java.util.Random;

public class BinarySearchInSortedNRotatedArray {
    public static void main(String[] args) {
        int[] a = new int[] {120, 135, 150, 5, 10, 35, 70, 90, 100};
        int key = a[new Random().nextInt(a.length)];
        System.out.println(key);
        System.out.println(getKey(a,key));
    }

    public static int getKey(int[] a, int key) {
        int low = 0, high = a.length-1, mid;
        while(low<=high){
            mid = (low + high)/2;
            if(a[mid] == key)
                return mid;
            if(a[low] < a[mid]){
                if(key > a[low] && key < a[mid])
                    high = mid-1;
                else
                    low = low+1;
            }
            else{
                if(key > a[mid] && key < a[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return -1;
    }
}

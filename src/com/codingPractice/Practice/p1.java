package com.codingPractice.Practice;

public class p1 {
    public static void main(String[] args) {
        int[] a = new int[]{2,3,1};
        int k =2;
        System.out.println(getMinInt(a, a.length, k));
    }

    static int getMinInt(int[] a, int length, int k) {
        int n = length, min = 0, sum=0, ksum=0, minIndex = 0;

        if(n==0)
            return -1;
        if (n==1)
            return a[1];

        for(int i=1; i< n; i++){
            min = Math.min(a[min],a[i]);
        }

        for (int i = 0; i < n; i++) {
            if(a[i] == min)
                minIndex = i;
        }

        for(int j = minIndex; j<n; j+=2){
            if(j!=n || j+2 != n){
                sum = sum + (a[j]+a[j+1]);
                ksum += sum*k;
            }
            else
                break;
        }

        sum = sum + (a[0]+a[n]);
        ksum += sum*k;

        int i = 1;

        while(i < minIndex){
            sum = sum + (a[i]+a[i+1]);
            ksum += sum*k;
            i+=2;
        }

        return ksum;
    }
}
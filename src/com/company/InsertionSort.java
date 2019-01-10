package com.company;

public class InsertionSort {
    public static int[] insertionSort(int[]arr){
        int x,y;
        for (int n=1;n<arr.length;n++){
            x=arr[n];
            y=n-1;
            while (y>=0&&arr[y]>x){
                arr[y+1]=arr[y];
                y--;
            }
            arr[y+1]=x;
        }
        return arr;
    }
}

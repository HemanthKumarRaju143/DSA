package org.example.Recursion.BasicRecursion;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr , 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void reverse(int arr[] , int l , int r){
        if(l >= r){
            return;
        }

        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
        reverse(arr , l + 1 , r - 1);
    }
}

package org.example.Recursion.BasicRecursion;

public class PrintLinearly1ToNBackTracking {
    public static void main(String[] args) {
        int n = 5;

        printLinearly1ToNBackTracking(n);
        System.out.println();
        printLinearlyNTo1BackTracking(1 , n);
    }

    public static void printLinearly1ToNBackTracking(int n){
        if(n < 1){
            return;
        }

        printLinearly1ToNBackTracking(n - 1);
        System.out.println(n);
    }

    public static void printLinearlyNTo1BackTracking(int i , int n){
        if(i > n){
            return;
        }

        printLinearlyNTo1BackTracking(i + 1 , n);
        System.out.println(i);
    }
}

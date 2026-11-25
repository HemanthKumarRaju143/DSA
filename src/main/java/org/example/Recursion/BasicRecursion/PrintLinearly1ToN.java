package org.example.Recursion.BasicRecursion;

public class PrintLinearly1ToN {
    public static void main(String[] args) {
        int n = 5;

        printLinearly1ToN(1 , n);
        System.out.println();
        printLinearlyNTo1(n);
    }
    public static void printLinearly1ToN(int i , int n){
        if(i > n){
            return;
        }

        System.out.println(i);
        printLinearly1ToN(i + 1 , n);
    }

    public static void printLinearlyNTo1(int n){
        if(n < 1){
            return;
        }

        System.out.println(n);
        printLinearlyNTo1(n - 1);
    }
}

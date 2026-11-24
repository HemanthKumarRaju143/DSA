package org.example.Recursion.BasicRecursion;

public class PrintName5Times {
    public static void main(String[] args) {
        int n = 5;

        printNNames(0 , n);
    }

    public static void printNNames(int count , int n){
        if(count >= n){
            return;
        }

        System.out.println(n + " Raju");
        printNNames(count + 1 , n);
    }
}

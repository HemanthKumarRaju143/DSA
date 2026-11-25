package org.example.Recursion.BasicRecursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String s = "MADAMA";

        boolean res = palindrome(s , 0 , s.length() - 1);
        System.out.println(res ? "palindrome" : "Not palindrome");
    }

    public static boolean palindrome(String s , int l , int r){
        if(l >= r){
            return true;
        }

        if(s.charAt(l) != s.charAt(r)){
            return false;
        }

        palindrome(s , l + 1 , r - 1);
        return true;
    }
}

package org.example.Recursion.SubSequence.SSIntro;

import java.util.ArrayList;
import java.util.List;

//SubSequence -> a contiguous or non-contiguous sequence which follows the order
public class SubSequence {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 3 , 4};

        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        printAllSS(arr , 0 , list1 , res);
        System.out.println(res);
    }

    public static void printAllSS(int arr[] , int ind , List<Integer> list , List<List<Integer>> res){
        if(ind >= arr.length){
            res.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[ind]);
        printAllSS(arr , ind + 1 , list , res);
        list.remove(list.size() - 1);
        printAllSS(arr , ind + 1 , list , res);
    }
}

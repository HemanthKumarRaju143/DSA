package org.example.Recursion.SubSequence.SSAllPatterns;

import java.util.ArrayList;
import java.util.List;

public class PrintingSSWhoseSumIsK {
    public static void main(String[] args) {
        int arr[] = {1 , 2 , 1 , 2};
        List<Integer> list1 = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        int targetSum = 2;
//        printingSSWhoseSumIsK(arr, 0, 0, targetSum , list1 , res);
//        System.out.println("Printing all SS where TargetSum " + res);

//        printOneSSSumIsK(arr , 0 , 0 , targetSum , list1 , res);
//        System.out.println("Printing only one SS where sum == TS = " + res);

        int SSCount = countSSWithTargetSum(arr , 0 , 0 , targetSum);
        System.out.println("printing noOf SS where sum == TS : " + SSCount);

    }

    public static void printingSSWhoseSumIsK(int arr[] , int ind , int sum , int targetSum , List<Integer> list , List<List<Integer>> res){
       if(ind >= arr.length){
           if(sum == targetSum){
               res.add(new ArrayList<>(list));
           }
           return;
       }

       sum += arr[ind];
       list.add(arr[ind]);
       printingSSWhoseSumIsK(arr , ind + 1 , sum , targetSum , list , res);
       sum -= list.get(list.size() - 1);
       list.remove(list.size() - 1);
       printingSSWhoseSumIsK(arr , ind + 1 , sum , targetSum , list , res);
    }

    public static boolean printOneSSSumIsK(int arr[] , int ind , int sum , int targetSum , List<Integer> list , List<List<Integer>> res){
        if(ind >= arr.length){
            if(sum == targetSum){
                res.add(new ArrayList<>(list));
                return true;
            }
            return false;
        }

        sum += arr[ind];
        list.add(arr[ind]);
        if(printOneSSSumIsK(arr, ind + 1, sum, targetSum, list, res)){
            return true;
        }
        sum -= list.get(list.size() - 1);
        list.remove(list.size() - 1);
        if(printOneSSSumIsK(arr, ind + 1, sum, targetSum, list, res)){
            return true;
        }

        return false;
    }

    public static int countSSWithTargetSum(int arr[] , int ind , int sum , int targetSum){
        if(sum > targetSum){
            return 0;
        }

        if(ind >= arr.length){
            if(sum == targetSum){
                return 1;
            }

            return 0;
        }

        int count = 0;
        count += countSSWithTargetSum(arr , ind + 1 , sum + arr[ind] , targetSum);
        count += countSSWithTargetSum(arr , ind + 1 , sum , targetSum);
        return count;
    }
}

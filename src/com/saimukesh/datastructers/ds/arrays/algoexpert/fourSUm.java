package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSUm {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<Integer[]>();
        Integer[] toBeAdded = new Integer[4];
     for(int i =0 ; i< array.length-3;i++){
         for(int j=i+1;j< array.length-2;j++){
             for(int k =j+1 ; k< array.length-1;k++){
                 for (int l = k+1; l < array.length; l++) {


                     if (array[i] + array[j] + array[k] + array[l] == targetSum) {
                         toBeAdded = new Integer[]{array[i], array[j], array[k], array[l]};
                         list.add(toBeAdded);
                     }
                 }
             }
         }
     }

        return list;
    }

    public static void main(String[] args) {
        int[] ques = new int[] {7, 6, 4, -1, 1, 2};
      List<Integer[]>  kList =  fourNumberSum(ques,16);
        for(Integer[] array : kList) {
            System.out.println(Arrays.toString(array));
        }
    }
}


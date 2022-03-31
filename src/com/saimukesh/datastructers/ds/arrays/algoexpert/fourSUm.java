package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSUm {

    public static List<Integer[]> fourNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> list = new ArrayList<Integer[]>();
        Integer[] toBeAdded = new Integer[4];
        for (int i : array) {
            for (int j : array) {
                for (int k : array) {
                    int sum = i + j + k;
                    if (sum - targetSum == 0) {
                        toBeAdded = new Integer[]{i, j, k, sum - targetSum};
                    }
                }
            }
        }
        list.add(toBeAdded);
        return list;
    }

    public static void main(String[] args) {
        int[] ques = new int[] {7, 6, 4, -1, 1, 2};
      List<Integer[]>  kList =  fourNumberSum(ques,6);
        for(Integer[] array : kList) {
            System.out.println(Arrays.toString(array));
        }
    }
}


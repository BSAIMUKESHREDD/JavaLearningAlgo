package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        int[] possible = new int[coins.length];
        for (int i = 0; i <coins.length ; i++) {
            //System.out.println(coins[i]);
            for (int j = 0; j <coins.length ; j++) {
              //  System.out.println(coins[j]);
                possible[i] = coins[i]+coins[j];
                System.out.println(possible[i]);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
      int[] coins = {1,2,5};
      //int[] coins = {5, 7, 1, 1, 2, 3, 22};
        nonConstructibleChange(coins);
    }
}

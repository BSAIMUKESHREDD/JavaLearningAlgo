package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;

public class NonConstructibleChange {

    public static int nonConstructibleChange(int[] coins) {
        // Write your code here.
        Arrays.sort(coins);
                int curr=0;
                for(int coin : coins){
                   // System.out.println(coin);
                    if(coin > curr+1){
                        return curr+1;
                    }
                    curr += coin;
                }
                return curr+1;
            }




    public static void main(String[] args) {
     // int[] coins = {1,2,5};
      int[] coins = {5, 7, 1, 1, 2, 3, 22};
        System.out.println(nonConstructibleChange(coins));
    }
}

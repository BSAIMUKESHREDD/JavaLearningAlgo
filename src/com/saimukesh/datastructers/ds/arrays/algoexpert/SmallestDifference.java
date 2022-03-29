package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;
//code Not WOrking
// Yetb to do
public class SmallestDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.

        //Solution 1 Partial BRute Force Working
       // System.out.println(Arrays.toString(arrayOne));
       // System.out.println(Arrays.toString(arrayTwo));
       /* int ans = 10000;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if(arrayOne[i]<0  ){arrayOne[i]=arrayOne[i] * (-1);}
                if(arrayTwo[j]<0  ){arrayTwo[j]=arrayTwo[j]* (-1);}
                int diff = arrayOne[i]-arrayTwo[j];
                if(diff<0  ){diff=diff* (-1);}
               // System.out.println(diff);
                if(diff<ans){
                   // System.out.println("run");
                  //  System.out.println(arrayOne[i]+"   "+arrayTwo[j]);
                    if (Math.abs(arrayOne[i] - arrayTwo[j]) == 2) {
                        System.out.println(arrayOne[i]+"   "+arrayTwo[j]);
                    }
                }
                ans = diff;
            }
        }*/
      /*  Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        for (int i = 0; i < arrayOne.length; i++) {

        }*/

        int l = 0;
        int r =0;
        int min = Math.abs(arrayOne[l] - arrayTwo[r]);
        if(arrayOne[l] < min){
            l++;
        }
        if(arrayTwo[r] > min){
            r++;
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        smallestDifference(new int[] {-1, 5, 10, 20, 28, 3}, new int[] {26, 134, 135, 15, 17});
    }
}

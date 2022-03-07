package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;

public class SortedSquareArray {

    public int[] sortedSquaresUsingInbuiltMethods(int[] nums) {

        int arr[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            arr[i]=(int)Math.pow(Math.abs(nums[i]),2);
        }
        Arrays.sort(arr);
        return arr;
    }

    public int[] sortedSquaredArrayUsingTwoPointerMethod(int[] array) {
        // Write your code here.
        int positivePointer =0;
        int negativePointer =0;
        while(negativePointer<array.length && array[negativePointer]<0){negativePointer++;}

                return new int[] {};
    }
}

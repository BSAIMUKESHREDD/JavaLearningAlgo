package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class firstDuplicateValue {
    public static int firstDuplicateValue(int[] array) {
        // Write your code here.
        //briuteFOrecmtd
        /*Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            if(array[i]==array[i+1]){
                System.out.println(array[i]);
                break;
            }
        }*/

        for(int value : array){
            int abs = Math.abs(value);
            if(array[abs-1]<0)return abs;
            array[abs-1] *= -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        var input = new int[] {2, 1, 5, 2, 3, 3, 4};
       int a = firstDuplicateValue(input);
        System.out.println(a);
    }
}

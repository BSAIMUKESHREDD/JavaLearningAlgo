package com.saimukesh.datastructers.ds.arrays.algoexpert;
import java.util.*;
public class targetSubsequnece {

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        // Write your code here.
        int z=0;
        for(int i =0; i<array.size()-1;i++){
            for(int j=0;j<array.size()-1;j++){
                if(array.get(i)==array.get(i)){
                    z++;
                }

            }

        }
        if(z == sequence.size()){
            return true;
        }
        return false;
    }





    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence =Arrays.asList(5, 26, 22, 8);
       isValidSubsequence(array,sequence);

    }
    }



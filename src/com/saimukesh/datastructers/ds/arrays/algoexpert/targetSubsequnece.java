package com.saimukesh.datastructers.ds.arrays.algoexpert;
import java.util.*;
public class targetSubsequnece {


        public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
            // Write your code here.
            int j = 0;
            for (int i = 0; i < array.size(); i++)
                if (i < array.size() && j < sequence.size() && array.get(i) == sequence.get(j)) ++j;

            return (j == sequence.size());
        }








    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence =Arrays.asList(5, 26, 22, 8);
       isValidSubsequence(array,sequence);

    }
    }



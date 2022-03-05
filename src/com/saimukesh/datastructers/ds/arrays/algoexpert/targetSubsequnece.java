package com.saimukesh.datastructers.ds.arrays.algoexpert;
import java.util.*;
public class targetSubsequnece {


        public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
            // Write your code here.
            int z=0;
            for(int i =0; i<array.size()-1;i++){
               int a= array.get(i) ;
                System.out.println(a);

                for(int j=0;j<array.size()-1;j++){
                  int  b= array.get(i);
                  System.out.println(b);
                    if(a==b){
                        z++;

                    }

                }
            }
            if(z== sequence.size()){return true;}
            return false;
        }


    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence =Arrays.asList(1, 6, -1, 10);
       isValidSubsequence(array,sequence);

    }
    }



package com.saimukesh.datastructers.ds.arrays.algoexpert;

public class ArrayOfProducts {
   public public static void main(String[] args) {
       System.out.println("HI");
   }
    public static int[] arrayOfProducts(int[] array) {
        // Write your code here.
        int prod=1;
        int zeroCount=0;
        int[] ans = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i]==0){zeroCount++;}
            if(zeroCount >=2){
                ans[i] = 0;
            }
break;
        }


        for (int i = 0; i < array.length; i++) {
            prod = prod* array[i];

        }
        for (int i = 0; i < array.length ; i++) {
            ans[i] = prod/array[i];
            System.out.println(ans[i]);
        }



        return ans;
    }

    public static void main(String[] args) {
        var input = new int[] {5, 1, 4, 2};
        arrayOfProducts(input);
    }


    public int[] arrayProducts(int[] array) {
        // Write your code here.
        int[] ans = new int[array.length];

        int left = 1;
        for (int i = 0; i < array.length ; i++) {
            ans[i] = left;
            left *= array[i];
        }
        int right =1;
        for (int i = array.length-1; i >= 0 ; i--) {
            ans[i] *= right;
            right *= array[i];
        }

        return ans;
    }
}




package com.saimukesh.datastructers.ds.arrays.algoexpert;

public class MonotonicArray {
    public static boolean isMonotonic(int[] array) {
        // Write your code here.
        if(array.length ==0 || array.length ==1 ){return  true;}
        boolean isincr = true;
        boolean isdec = true;
        int n=array.length;
        for (int i = 0; i < n- 1; ++i) {
            if (array[i] > array[i+1])
                isincr = false;
            if (array[i] < array[i+1])
                isdec = false;
        }
        return isincr || isdec;
    }


    public static void main(String[] args) {
      //  var array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
        var array = new int[] {-1};

        boolean ans =isMonotonic(array);
        System.out.println(ans);
    }

}


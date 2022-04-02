package com.saimukesh.datastructers.ds.arrays.algoexpert;

public class SUbArraySorat {
    public static boolean isSortedORnot(int i ,int num ,int[] arr  ){
        if(i ==0){ return num>arr[i+1]; }
        if( i == arr.length-1 ){return num<arr[i-1];}
        return num>arr[i+1]||num<arr[i-1];
    }

    public static int[] subarraySort(int[] array) {
        // Write your code here.
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];

            if (isSortedORnot(i, num, array)) {
                min = Math.min(min, num);
                max = Math.max(max, num);
            }
        }
        if(min == Integer.MAX_VALUE){
            return new int[]{-1,-1};
        }
        int left =0;
        int right = array.length-1;
        while (min>=array[left]){left++;}
        while(max<=array[right]){right--;}
        return new int[]{left,right};


    }



    public static void main(String[] args) {
       int[] ans =  new int[] {1, 2, 4, 7, 10, 11, 7, 12, 6, 7, 16, 18, 19};
       subarraySort(ans);
       //ystem.out.println(a.charAt(1));
    }
}

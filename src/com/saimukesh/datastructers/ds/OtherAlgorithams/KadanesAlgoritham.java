package com.saimukesh.datastructers.ds.OtherAlgorithams;

public class KadanesAlgoritham {

    public static int kadanesAlgorithm(int[] array) {
        // Write your code here.
        int maxsum=0;
        int sum =0;
        for (int i = 0; i < array.length; i++) {
            sum = sum+array[i];

            if(sum>maxsum){
                maxsum=sum;
            }

            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxsum);
        return maxsum;
    }

    public static void main(String[] args) {
        int[] input = {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
kadanesAlgorithm(input);

    }
}

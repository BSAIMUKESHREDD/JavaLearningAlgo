package com.saimukesh.datastructers.ds.OtherAlgorithams;

public class KadanesAlgoritham {

    public static int kadanesAlgorithm(int[] array) {
        // Write your code here.
        int negtiveSum=-1;
        int maxmeg=0;
        int maxsum=0;
        int sum =0;
        int lenght =0;
        for (int i = 0; i < array.length; i++) {

            if(array[i]<0){
                lenght++;
                maxmeg = Math.max(negtiveSum,array[i]);
               // System.out.println(maxmeg);

            }


            sum = sum+array[i];

            if(sum>maxsum){
                maxsum=sum;
            }

            if(sum<0){
                sum=0;
            }
        }

        if(lenght == array.length){
            return maxmeg;
        }
        System.out.println(maxsum);
        return maxsum;
    }

    public static int kadanesAlgorithms1(int[] array) {
        int max = array[0];
        int localMax= array[0];

        for(int i=1;i<array.length;i++){
            int num = array[i];
            max = Math.max(num,max+num);
            localMax = Math.max(localMax,max);
        }

        return localMax;
    }


        public static void main(String[] args) {
        int[] input = {-10, -2, -9, -4, -8, -6, -7, -1, -3, -5};
     //   System.out.println(kadanesAlgorithm(input));
            System.out.println(kadanesAlgorithms1(input));

    }
}

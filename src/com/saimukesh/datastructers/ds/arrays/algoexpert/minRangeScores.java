package com.saimukesh.datastructers.ds.arrays.algoexpert;

public class minRangeScores {
    public static int minRewards(int[] scores) {
        // Write your code here.
        int count =0;
        int sum=0;
      //  System.out.println("hii");

        for (int i = scores.length -1; i >0 ; i--) {
            System.out.println(scores[i]);
            if(scores[i]<scores[i-1]){
                count =0;
               // System.out.println("hii");

            }
            else{
                    count++;
               // System.out.println(count);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ans =new int[] {8, 4, 2, 1, 3, 6, 7, 9, 5};
       // System.out.println("hii");
        minRewards(ans);
    }
}

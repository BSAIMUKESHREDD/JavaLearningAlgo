package com.saimukesh.datastructers.ds.Stacks;

public class WaterArrayProblem {
    public static void main(String[] args) {
int[] a = {2,4,0,0,9};
        int length = a.length;
        System.out.println(length);

        trappingWater(a,4);
    }
        // arr: input array
        // n: size of array
        // Function to find the trapped water between the blocks.
        static long trappingWater(int arr[], int n) {

       int leftArr[] = new int[0];
       int rightArr[]= new int[0];
       int ansArr[]= new int[0];

            for (int i = 0; i < arr.length-1; i++) {
               if(arr[i]>arr[i]) {
                   leftArr[i] = arr[i];
                   System.out.println(leftArr[i]);
               }
            }

            for (int i = arr.length-1; i <0; i++) {
                if(arr[i]>arr[i-1]) {
                    rightArr[arr.length-i] = arr[i];
                    System.out.println(rightArr[i]);

                }
            }
            for (int i = 0; i < arr.length-1; i++) {
                ansArr[i] = leftArr[i]-rightArr[i];
            }
long ans=0;
            for (int i = 0; i < ansArr.length-1; i++) {
                ans = ansArr[i]++;
            }
            return ans;
        }


    }

package com.saimukesh.datastructers.ds.Stacks;

public class NextGreateerElemetn_forEachelemenrInanArray {


    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Your code here
        long[] ans = {};
        long next = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    next = arr[j];
                    break;
                }
                System.out.println(next);

                }
            }
        return ans;
        }


    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for (i=0; i<n; i++)
        {
            next = -1;
            for (j = i+1; j<n; j++)
            {
                if (arr[i] < arr[j])
                {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" -- "+next);
        }
    }



    public static void main(String[] args) {
        int  N = 4;
       long[] arr = {1 ,3 ,2 ,4};
        nextLargerElement(arr,N);
        int ar[]= {11, 13, 21, 3};

        printNGE(ar, N);
       //System.out.println(b);

    }
}

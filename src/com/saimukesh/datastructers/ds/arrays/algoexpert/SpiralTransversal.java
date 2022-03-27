package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.List;
//yet to complete
public class SpiralTransversal {
    public static List<Integer> spiralTraverse(int[][] array) {
        // Write your code here.
        List<Integer> ans = new ArrayList<Integer>();
        int top =0;
        int bottom = 3 ;
        int left =0;
        int right =3;
        int direction = 0;
        int i=0;
            while(top<=bottom && left<=right) {
                if (direction == 0) {
                    for (int j = left; j < array.length; j++) {
                        ans.add(array[top][j]);
                        System.out.println(array[top][j]);
                    }
                    top++;
                }
                else if(direction ==1){
                    for (int j = top; j < bottom; j++) {
                        ans.add(array[j][right]);
                        System.out.println(array[j][right]);
                    }
                    right--;
                }
                else if (direction==2){
                    for (int j = right; j >=left ; j--) {
                        ans.add(array[bottom][j]);
                        System.out.println(array[bottom][j]);

                    }
                    bottom--;
                }
                else if(direction==3){
                    for (int j = bottom; j >=top ; j--) {
                        ans.add(array[j][left]);
                        System.out.println(array[j][left]);
                    }
                    left++;
                }
                direction=(direction+1)%4;

            }
        return ans;
    }

    public static void main(String[] args) {
        var input =
                new int[][] {
                        {1, 2, 3, 4},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7},
                };

        spiralTraverse(input);
    }
}

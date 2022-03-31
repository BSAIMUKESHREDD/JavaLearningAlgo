package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlappingIntervals {

    public static int[][] mergeOverlappingIntervals(int[][] intervals) {
        // Write your code here.
     List<int[]> res = new ArrayList<int[]>();
      if(intervals.length == 0 ){return res.toArray(new int[0][]);}
        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

      int start = intervals[0][0];
      int end = intervals[0][1];

      for( int[] i : intervals){
          if(i[0]<= end ){
              end = Math.max(end,i[1]);
          }else{
              res.add(new int[]{start,end});
              start = i[0];
              end=i[1];

          }
      }
      res.add(new int[]{start,end});
        return res.toArray(new int[0][]);
    }


    public static void main(String[] args) {

        int[][] intervals =
                new int[][] {
                        {1, 2},
                        {3, 5},
                        {4, 7},
                        {6, 8},
                        {9, 10}
                };

       int[][] an =  mergeOverlappingIntervals(intervals);


    }
}

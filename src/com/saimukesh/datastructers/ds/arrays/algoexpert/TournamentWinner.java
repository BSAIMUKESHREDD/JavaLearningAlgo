package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        for (int i = 0; i <competitions.size() ; i++) {
             int a = (results.get(i));

            // System.out.println(competitions.get(i));
             // String[] arr = (String[]) competitions.get(i).toArray();
            //System.out.println(competitions.get(i));
            for(int j=0;j<2 ; competitions.get(i)){
                //System.out.println(j);
                if(a==0){

                }else{

                }

            }

        }

        return "";
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));

        tournamentWinner(competitions,results);
    }

}



//        {
//            "competitions": [
//    ["HTML", "Java"],
//    ["Java", "Python"],
//    ["Python", "HTML"]
//  ],
//            "results": [0, 1, 1]
//        }
//
//    }


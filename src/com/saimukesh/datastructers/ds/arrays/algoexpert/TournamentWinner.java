package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String,Integer> map = new HashMap<String,Integer>();

        for (int i = 0; i < results.size()-1 ; i++) {
            if(i==0){
                for (int j = 0; j < competitions.size()-1; j++) {

                    System.out.println(competitions.get(0));

                    competitions.get(0).forEach(s -> {
                        //System.out.println(s);
                        int sum =0;

                        map.putIfAbsent(s,sum);
                    });
                }
            }
            if(i==1){


                    System.out.println(competitions.get(1));

                    competitions.get(1).forEach(s -> {
                        //System.out.println(s);
                        int sum =3;

                        map.putIfAbsent(s,sum);
                    });

            }


        }

        //System.out.println(map);

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


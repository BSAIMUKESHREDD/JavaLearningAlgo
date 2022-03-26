package com.saimukesh.datastructers.ds.arrays.algoexpert;

import java.util.*;

public class TournamentWinner {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        Map<String,Integer> map = new HashMap<String,Integer>();
        final int[] sum = {0};

        competitions.forEach(strings -> {
            // System.out.println(strings.get(1));
                    for (int i = 0; i < results.size() ; i++) {
                        if(i==0){
                            map.putIfAbsent(strings.get(0), sum[0]);
                            sum[0]+=3;
                            map.putIfAbsent(strings.get(1),sum[0]);
                        }
                        if(i==1){
                             sum[0] +=3;
                            map.putIfAbsent(strings.get(1), sum[0]);
                        }
                    }

        });



        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        return key;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> competitions = new ArrayList<ArrayList<String>>();
     // test case 1
        /*   ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("HTML", "C#"));
        ArrayList<String> competition2 = new ArrayList<String>(Arrays.asList("C#", "Python"));
        ArrayList<String> competition3 = new ArrayList<String>(Arrays.asList("Python", "HTML"));
        competitions.add(competition1);
        competitions.add(competition2);
        competitions.add(competition3);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 0, 1));
*/

        // test case 2
        ArrayList<String> competition1 = new ArrayList<String>(Arrays.asList("A", "B"));
        competitions.add(competition1);
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0));

        String ans =tournamentWinner(competitions,results);
        System.out.println(ans);

    }

}



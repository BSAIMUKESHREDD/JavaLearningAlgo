import java.util.*;

class Program {

    public int HOME_TEAM_WON =1;
    public String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.// Write your code here.
        String curr ="";
        HashMap<String ,Integer> scores = new HashMap<String,Integer>();
        scores.put(curr,0);

        for (int i = 0; i < competitions.size(); i++) {
            ArrayList<String> competition = competitions.get(i);
            int result = results.get(i);

            String home = competition.get(0);
            String away = competition.get(1);

            String win = (result == HOME_TEAM_WON)? home:away;

            updateScores(win,3,scores);

            if(scores.get(win)> scores.get(curr)){
                curr=win;
            }

        }

        return curr;
    }

    public void updateScores(String team ,int points , HashMap<String ,Integer> scores){
        if(!scores.containsKey(team)){
            scores.put(team,0);
        }
        scores.put(team,scores.get(team)+points);
    }


}


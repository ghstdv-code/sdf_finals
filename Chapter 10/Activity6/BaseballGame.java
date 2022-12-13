package Activity6;

public class BaseballGame {
    private String[] teams = new String[2];
    protected int[][] scores;

    public BaseballGame(){
        scores = new int[2][9];
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 9; j++)
                scores[i][j] = 999;
    }

    public void setTeams(int team, String name){
        teams[team] = name;
    }

    public void setScores(int position, int teamNumber, int score){
        if(position == 0 || (position < scores[teamNumber].length) && scores[teamNumber][position-1] != 999){
            scores[teamNumber][position] = score;
            if(scores[0][scores[0].length-1] != 999 && scores[1][scores[1].length-1] != 999) 
                computeScore();
        }
    }

    private void computeScore() {
        int a = 0, b = 0;
        for(int score: scores[0])
            a += score;

        for(int score: scores[1])
            b += score;

        if(a > b) System.out.println("\nTeam 1 Wins!");
        else if(a < b) System.out.println("\nTeam 2 Wins!");
        else System.out.println("\nTeam are tie!");
    }

    public String getTeamName(int teamNumber){return teams[teamNumber];}
    public int getScore(int teamNumber, int position){return scores[teamNumber][position];}
}

package Activity5;

public class SugarSmashPlayer {
    private int playerId;
    private String screeName;
    private int[] highScore = new int[10];

    public void setId(int id){this.playerId = id;}
    public void setName(String name){this.screeName = name;}
    public void setScore(int score, int level){
        @SuppressWarnings("unused")
        int previousLevel;
        if(level == 1) highScore[level - 1] = score;
        else{
            previousLevel = highScore[level - 2];
            if(score < 100) System.out.println("Did not achieve 100 pts score on the first level");
            else highScore[level - 1] = score;
      }
    }

    public int getId(){return this.playerId;}
    public String getName(){return this.screeName;}
    public int getScore(int level){
        int score = 0;
        if(level < 0 || level > 9) System.out.println("Invalid level!");
        else score = highScore[level - 1];   
        return score;
    }
}

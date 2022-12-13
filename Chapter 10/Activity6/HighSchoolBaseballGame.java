package Activity6;

public class HighSchoolBaseballGame extends BaseballGame {
    public HighSchoolBaseballGame(){
        scores = new int[2][7];
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 7; j++)
                scores[i][j] = 999;
    }
}

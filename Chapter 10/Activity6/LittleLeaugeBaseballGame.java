package Activity6;

public class LittleLeaugeBaseballGame extends BaseballGame{
    LittleLeaugeBaseballGame(){
        scores = new int[2][6];
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 6; j++)
                scores[i][j] = 999;
    }
}

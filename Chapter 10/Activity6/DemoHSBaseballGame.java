package Activity6;

import java.util.Scanner;

public class DemoHSBaseballGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        String[] team = {"1st", "2nd"};
        
        BaseballGame b = new BaseballGame();
        for(int i = 0; i < 2; i++){ 
            System.out.print("\nInput " + team[i] + " Team >> ");
            b.setTeams(i, sc.nextLine());
            count = 0;
            while(count < 7){
                System.out.print(String.format("Enter the score of %s team in inning %d >> ", team[i], count+1));
                b.setScores(count, i, sc.nextInt());
                sc.nextLine();
                count++;
            }
        }
        sc.close();
    }
}

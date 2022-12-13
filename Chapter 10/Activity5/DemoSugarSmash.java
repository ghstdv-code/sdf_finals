package Activity5;

import java.util.Scanner;

public class DemoSugarSmash {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        SugarSmashPlayer ssp = new SugarSmashPlayer();
        
        System.out.print("Enter ID number: ");
        ssp.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Enter Screen Name: ");
        ssp.setName(sc.nextLine());
    

        for(int i = 0; i < 10; i++){
           System.out.print("Enter high score for level " + (i+1) + ": ");
           int hScore = sc.nextInt();
           ssp.setScore(hScore, i+1);
        }
        sc.close();      
        System.out.println("Output for: " + ssp.getName() + "\nID: " + ssp.getId());
           
        for(int i = 0; i < 10; i++){
           System.out.println("Level: " + (i+1) + "\tScore: " + ssp.getScore(i+1));
        }
    }
}
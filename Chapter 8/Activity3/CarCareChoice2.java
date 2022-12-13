package Activity3;

import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        float[] prices = {25f, 22f, 15f, 5f};
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("List of Services: \"oil change\", \"tire rotation\", \"battery check\", \"break inspection\".");
        System.out.println("First three[3] letters of the option is valid.");

        String s = "oil change";

        while(true)
        {
            System.out.print("\nEnter Service: ");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("oil change") || s.equalsIgnoreCase("oil")){
                total = prices[0];
                break;
            }
            else if(s.equalsIgnoreCase("tire rotation") || s.equalsIgnoreCase("tir")){
                total = prices[1];
                break;
            }
            else if(s.equalsIgnoreCase("battery check") || s.equalsIgnoreCase("bat")){
                total = prices[2];
                break;
            }
            else if(s.equalsIgnoreCase("break inspection") || s.equalsIgnoreCase("bre")){
                total = prices[3];
                break;
            }
            else System.out.println("Invalid Option!");
        }    
        sc.close();

        System.out.println(String.format("Service Price is: $%.2f", total));
    }
}

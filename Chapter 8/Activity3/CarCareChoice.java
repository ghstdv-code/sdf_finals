package Activity3;

import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        float[] prices = {25f, 22f, 15f, 5f};
        float total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("List of Services: \"oil change\", \"tire rotation\", \"battery check\", \"break inspection\".");
        
        String s = "oil change";

        while(true)
        {
            System.out.print("\nEnter Service: ");
            s = sc.nextLine();
            if(s.equalsIgnoreCase("oil change")){
                total = prices[0];
                break;
            }
            else if(s.equalsIgnoreCase("tire rotation")){
                total = prices[1];
                break;
            }
            else if(s.equalsIgnoreCase("battery check")){
                total = prices[2];
                break;
            }
            else if(s.equalsIgnoreCase("break inspection")){
                total = prices[3];
                break;
            }
            else System.out.println("Invalid Option!");
        }    
        sc.close();

        System.out.println(String.format("Service Price is: $%.2f", total));
    }
}

package Activity2;

import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        var sc =  new Scanner(System.in);
        double[] values = new double[20];
        int counter = 0;
        double temp = 0, total = 0; 

        while(counter  < values.length && temp != 99999){
            System.out.print("Enter a number or 99999 to quit: ");
            temp = sc.nextDouble();
            if(temp != 99999){
                values[counter] = temp;
                total += temp;
                counter++;
            }
            else break;
        }

        sc.close();
        System.out.println(String.format("\nNumber of Inputs: %d", counter));
        System.out.println(String.format("Average: %.2f", total / counter));

        for(int i = 0; i < counter; i++){
            System.out.print(String.format("%.2f is %.2f away from average\n", values[i], (total / counter) - values[i]));
        }
    }
}

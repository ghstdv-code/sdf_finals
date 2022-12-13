package Activity2;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[6];

        for(int i = 0; i < 6; i++){
            System.out.print("Enter a number #" + (i+1) + ": ");
            numbers[i] = sc.nextDouble();
        }
        sc.close();

        System.out.println();
        DisplayMean(numbers);
        DisplayMedian(numbers);
    }

    static void DisplayMedian(double[] arr){
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            System.out.println(String.format("Median: %.1f",(arr[(arr.length/2)-1] + arr[arr.length/2])/2)); 
        }
    }

    static void DisplayMean(double[] arr){
        double ave = 0;
        for(double n:arr)
            ave += n;
        
        System.out.println(String.format("Mean: %.1f", (ave / arr.length)));
    }
}

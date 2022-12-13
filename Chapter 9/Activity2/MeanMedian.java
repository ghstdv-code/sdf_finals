package Activity2;

import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number #" + (i+1) + ": ");
            numbers[i] = sc.nextInt();
        }
        sc.close();

        System.out.println();
        DisplayMean(numbers);
        DisplayMedian(numbers);
    }

    static void DisplayMedian(int[] arr){
        Arrays.sort(arr);
        System.out.println("Median: " + arr[2]);
    }

    static void DisplayMean(int[] arr){
        int ave = 0;
        for(int n:arr)
            ave += n;
        
        System.out.println("Mean: " + (ave / arr.length));
    }
}

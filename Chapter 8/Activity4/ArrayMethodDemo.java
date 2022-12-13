package Activity4;

import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args)
   {
      int[] numbers = {25, 58, 56, 25, 75, 69, 70, 12, 32, 34};
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int value = sc.nextInt();
      sc.close();
      displayAll(numbers);
      displayReverse(numbers);
      displaySum(numbers);
      displayLessThan(numbers, value);
      displayGreaterThan(numbers, value);
         
   }  

   static void displayAll(int[] numbers){
       System.out.print("List of Integers: ");
       for(int i:numbers){
           System.out.print(i + " ");
       }
       System.out.println();
   }

    static void displayReverse(int[] numbers){
    System.out.print("List of Integers in reverse: ");
        for(int i = numbers.length-1; i >= 0; i--){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    static void displaySum(int[] numbers){
        int x = 0;
        for(int i:numbers){
            x += i;
        }
        System.out.println("Sum of Numbers is: " + x);
    }

    static void displayLessThan(int[] numbers, int value){
        System.out.print("Number Less than " + value + ": ");
        for(int i:numbers){
            if(i < value) System.out.print(i + " ");
        }
        System.out.println();
    }

    static void displayGreaterThan(int[] numbers, int value){
        System.out.print("Number Greater than " + value + ": ");
        for(int i:numbers){
            if(i > value) System.out.print(i + " ");
        }
        System.out.println();
    }
}

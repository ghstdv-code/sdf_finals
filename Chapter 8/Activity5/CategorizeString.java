package Activity5;

import java.util.Scanner;

public class CategorizeString {
    public static void main (String[] args)
    {       
      byte shortCounter = 0, longCounter = 0;
      Scanner sc = new Scanner(System.in);
      String[] longStrings = new String[10];
      String[] shortStrings = new String[10];
      String input = "";
       
      while(!input.toUpperCase().equals("Q") && (shortCounter + longCounter < 10))
      {
         System.out.print("Enter a string or [Q] to quit >> ");
         input= sc.nextLine();
         if(!input.toUpperCase().equals("Q")){
            if(input.length() <= 10)
            {
               shortStrings[shortCounter] = input;
               shortCounter++;
            }
            else if(input.length() > 10)
            {
               longStrings[longCounter] = input;
               longCounter++;
            }
            
         }        
      }
      
      input = "";
      while(!input.toUpperCase().equals("Q"))
      {
      System.out.print("\nPlease enter [S]short list or [L]long list or [Q] to quit >> ");
      input = sc.nextLine();
         if(input.substring(0, 1).toUpperCase().equals("S"))
            displayResult(shortStrings, shortCounter);
         else if(input.substring(0, 1).toUpperCase().equals("L"))
            displayResult(longStrings, longCounter);
         else{
            if(!input.toUpperCase().equals("Q")) System.out.println("Invalid Option!");
         }
      }
      sc.close();
    }
    
    static void displayResult(String[] arr, int count)
    {
       System.out.println();
       if(count == 0)
          System.out.println("The list is empty");
       else
          for(int i = 0; i < count; i++)
             System.out.println(arr[i]); 
    }
}

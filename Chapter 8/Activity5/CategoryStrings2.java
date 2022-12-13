package Activity5;

import java.util.Scanner;

public class CategoryStrings2 {
   public static void main (String[] args)
   {       
     byte one_word_counter = 0, two_word_counter = 0, long_word_counter = 0;
     Scanner sc = new Scanner(System.in);
     String[] one_word = new String[10];
     String[] two_word = new String[10];
     String[] long_word = new String[10];
     String input = "";
      
     while(!input.toUpperCase().equals("Q") && ((one_word_counter + two_word_counter + long_word_counter) < 10))
     {
         System.out.print("Enter a string or [Q] to quit >> ");
         input= sc.nextLine();
         if(!input.toUpperCase().equals("Q")){
            int j = 0;  
            for(int i = 0; i < input.length(); i++)
               if(input.charAt(i) == ' ') j++;
               
            if(j == 0){
               one_word[one_word_counter] = input;
               one_word_counter++;
            }
            else if(j == 1){
               two_word[two_word_counter] = input;
               two_word_counter++;
            }
            else{
               long_word[long_word_counter] = input;
               long_word_counter++;
            }     
         }        
      }
     
      input = "";
     while(!input.toUpperCase().equals("Q"))
     {
         System.out.print("\nPlease enter [O]One word list(s), [T]Two word list(s), [L]Long word list(s) or [Q] to quit >> ");
         input = sc.nextLine();
         if(input.substring(0, 1).toUpperCase().equals("O"))
            displayResult(one_word, one_word_counter);
         else if(input.substring(0, 1).toUpperCase().equals("T"))
            displayResult(two_word, two_word_counter);
         else if(input.substring(0, 1).toUpperCase().equals("L"))
            displayResult(long_word, long_word_counter);
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

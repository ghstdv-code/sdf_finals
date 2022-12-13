package Activity1;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[20];
        for(int i = 0; i < 20; i++){
            System.out.print(String.format("Input string #%d: ", i+1));
            str[i] = sc.nextLine();
        }
        sc.close();
        Arrays.sort(str);
        System.out.println("\nSorted Strings:");
        for(String st:str)
            System.out.println(st);
    }
}

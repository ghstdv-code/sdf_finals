package Activity1;

import java.util.Arrays;
import java.util.Random;

public class StringSort{
    public static void main(String[] args) {
        String alp = "qwertyuiopasdfghjklzxcvbnm";
        Random random =  new Random();
        String[] listOfString = new String[20];
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < 20; i++){
            sb.setLength(0);
            for(int j = 0; j < 5; j++){
                int index = random.nextInt(alp.length());
                char randStr = alp.charAt(index);
                sb.append(randStr);
            }
            listOfString[i] = sb.toString();
        }


        Arrays.sort(listOfString);
        
        for(String str:listOfString)
            System.out.println(str);
    }
}
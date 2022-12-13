package Activity1;

import java.util.Scanner;

public class DemoHorses {
    public static void main(String[] args) {
        Horse h = new Horse();
        RaceHorse rh = new RaceHorse();
        Scanner sc = new Scanner(System.in);
        String name, color;
        int year, numOfRaces;

        System.out.print("Horse Name: ");
        name = sc.nextLine();

        System.out.print("Horse Color: ");
        color = sc.nextLine();

        System.out.print("Horse Year: ");
        year = sc.nextInt();
        sc.nextLine();

        System.out.print("Number of Races: ");
        numOfRaces = sc.nextInt();        
        System.out.println();
        sc.close();

        h.SetName(name);
        h.SetColor(color);
        h.SetYear(year);
        rh.SetNumberOfRace(numOfRaces);

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Horse Name:      %s\n", h.GetName()));
        sb.append(String.format("Horse Color:     %s\n", h.GetColor()));
        sb.append(String.format("Birth Year:      %d\n", h.GetYear()));
        sb.append(String.format("Number of Races: %d\n", rh.GetNumberOfRace()));
        System.out.println(sb.toString());
    }
}

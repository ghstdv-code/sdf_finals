package Activity1;

public class RaceHorse extends Horse {
    private int numOfRaces;

    RaceHorse(){}
    RaceHorse(String name, String color, int year) {
        super(name, color, year);
    }

    public void SetNumberOfRace(int numOfRaces){this.numOfRaces = numOfRaces;}
    public int GetNumberOfRace(){return this.numOfRaces;}
    
}

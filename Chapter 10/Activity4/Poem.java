package Activity4;

public class Poem {
    private String Name;
    private int numOfLines;

    Poem(String name, int numOfLines){
        this.Name = name;
        this.numOfLines = numOfLines;
    }

    public String getName(){return this.Name;}
    public int getNumberOfLines(){return this.numOfLines;}
}

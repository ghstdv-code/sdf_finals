package Activity1;

public class Horse {
    private String name, color;
    private int year;

    Horse(String name, String color, int year){
        this.name = name;
        this.color = color;
        this.year = year;
    }

    Horse(){}

    public void SetName(String name){this.name = name;}
    public void SetColor(String color){this.color = color;}
    public void SetYear(int year){this.year = year;}

    public String GetName(){return this.name;}
    public String GetColor(){return this.color;}
    public int GetYear(){return this.year;}
}
